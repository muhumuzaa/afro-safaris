package afro_safaris;

import java.util.*;


import afro_safaris.model.Destination;
import afro_safaris.model.SafariPackage;
import afro_safaris.service.CustomPackageService;
import afro_safaris.service.Destinations;
import afro_safaris.service.PremadePackageService;
import afro_safaris.util.PackageCost;

public class App {


	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("\n\nWelcome to Afro Safaris !!");
		System.out.println("Book from our Pre-made packages or Customize your own. \n");
	
		boolean running = true;
		
		while(running) {
			
			//Display a menu of pre-made packages + option to create custom ones + option to exit
			List<SafariPackage> premadePackages = PremadePackageService.createPremadePackages();
			
			for(int i = 0; i < premadePackages.size(); i++) {
				System.out.println((i+1)+ ". "+premadePackages.get(i)); 
			}
			
			//This increments on top of the size of the pre-made packages. This is dynamic incase the PremadePackageService increase or reduces packages or generates them randomly
			int customizeOption = premadePackages.size()+1;
			
			System.out.println(customizeOption+ ". Customize your own safari Package.");
			System.out.println("0. Exit");
			
			//Get user input/choice
			System.out.print("\nEnter your choice: ");
			
			int userChoice = scanner.nextInt();
			scanner.nextLine();
			
			
			
			//logic depending on user input
			SafariPackage selected = null;
			
			if(userChoice >= 1 && userChoice <= premadePackages.size()) {
				//I'm using -1 because when I'm displaying the pre-made packages, I put (i+1) since Lists start from 0 index. if user inputs 2, that choice refers to package at index 1 in the premadePackages List 
				selected = premadePackages.get(userChoice -1 );
				
				//if user wants to create custom package
			} else if(userChoice == customizeOption) {
				selected = CustomPackageService.createPackage(scanner);
				
				//user chooses to exit
			} else if (userChoice ==0) {
				System.out.println("Thank you for visiting Afro Safaris! Goodbye! ");
				running = false; 
				continue; //skip rest of the loop
			} else {
				System.out.println("Invalid choice. Enter numbers between 0 - "+customizeOption);
				continue; //show menu again
			}
			
			
			//Confirm and Display details of user's booking details
			System.out.println("\nHere are your booking details: ");
			System.out.println(selected); //display the selected package,
			
			//Ask number of people booking the package and offer discounted cost if more than 1
			System.out.print("\nHow many people are booking this Safari?: ");
			System.out.println("\nEvery extra person gets 10% discount! Please note: packages have a maximum limit of 10 people.");
			
			
			int numOfPeople = 0; //throw custom exception if user puts 0 or above 10
			while(true) {
				if(scanner.hasNextInt()) {
					numOfPeople = scanner.nextInt();
					if(numOfPeople >=1 && numOfPeople <= 10) {
						scanner.nextLine();
						break;
					}else {
						System.out.println("Invalid number. Please enter a value between 1 and 10.");
			            System.out.print("\nHow many people are booking this Safari? ");
			            scanner.nextLine(); // Consume the rest of the line
					}
				}else {
					System.out.println("That's not a valid number. Please try again.");
			        System.out.print("\nHow many people are booking this Safari? ");
			        scanner.next(); //consumes invalid input
				}
			}
			
			
			
			//calculate cost depending on number of people
			double packageCost = PackageCost.calculatePackageCost(numOfPeople, selected.getPackageCost());
			
			
			
			//TODO custom exception to handle user putting invalid input or wrong no. of people
			if(numOfPeople ==1) {
				System.out.printf("Total Booking cost for 1 person: $%.2f%n ", packageCost);
			}else {
				double savings = numOfPeople*selected.getPackageCost() - packageCost;
				System.out.printf("Total Booking cost for %d people: $%.2f ", numOfPeople, packageCost );
				System.out.printf("You have saved $%.2f", savings);
			}
			

			
			//Ask if they want to book another
			System.out.print("\n\nWould you like to book another package? Reply with 'y' or 'n': ");
			String bookAgain = scanner.nextLine().trim().toLowerCase(); //normalize their reply
			if(!bookAgain.equals("y")) {
				System.out.println("\nThank you for booking with Afro Safaris! Enjoy your trip!");
				running = false;
			}
			

		}
		
		scanner.close(); //close the scanner

	}
	
	
	
	
}
