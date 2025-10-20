package afro_safaris;

import java.util.*;

import afro_safaris.exception.InvalidInputException;
import afro_safaris.model.SafariPackage;
import afro_safaris.service.CustomPackageService;
import afro_safaris.service.PremadePackageService;
import afro_safaris.util.PackageCost;
import afro_safaris.util.UserInputController;

public class App {


	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		//tracks number of packages booked with their ids
		Map<Integer, SafariPackage> bookedPackages = new HashMap<>();
		
		//Start of the app menu
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
			
			
			int userChoice = -1; //declared outside the try-catch block so userChoice is accessible outside try-catch
			
			try {
				userChoice = scanner.nextInt();
				scanner.nextLine();
			}catch(InputMismatchException e) {
				System.out.println("Invalid choice. Please enter a number.");
				scanner.nextLine(); // consume bad input
				continue;
			}
			
			
			
			
			
			
			
			SafariPackage selected = null; //Initially, no SafariPackages have been created
			
			//logic depending on user input
			if(userChoice >= 1 && userChoice <= premadePackages.size()) {
				
				//I'm using -1 because when I'm displaying the pre-made packages, I put (i+1) since Lists start from 0 index. if user inputs 2, that choice refers to package at index 1 in the premadePackages List 
				selected = premadePackages.get(userChoice -1 );
				
				//if user wants to create custom package
			} else if(userChoice == customizeOption) {
				
				//try-catch to handle runtime exceptions using my InvalidInputException when creating custom packages
				while (true) {
				try {
					selected = CustomPackageService.createPackage(scanner);
					break; //packge created, exit this loop
					
				}catch(InvalidInputException e ) {
					System.err.println("\n----Error creating your custom package---");
					System.err.println("Error is: "+e.getMessage());
					
					//Logging error for better user experience
					if(e.getErrorType() == InvalidInputException.ErrorType.FORMART_ERROR) {
						System.err.println("Action: Input must be a whole number.");
					}else if(e.getErrorType() == InvalidInputException.ErrorType.RANGE_ERROR) {
						System.err.println("Action: Input was outside the allowed boundaries.");
					}
				}
				}
				
				
				//user chooses to exit
			} else if (userChoice ==0) {
				System.out.println("Thank you for visiting Afro Safaris! Goodbye! ");
				running = false; 
				continue; //skip rest of the loop
			} 
			
			
			
			////display to user the selected package,
			System.out.println("\nYou have selected: \n");
			System.out.println(selected); 
			System.out.println("\nComplete the step below to finalize your boooking. \n"); //prompt user to continue adding input to complete their booking
			
			//Ask number of people booking the package and offer discounted cost if more than 1
			System.out.println("\n----  DISCOUNT ON GROUP BOOKINGS!!! Every extra person gets 10% discount! ----------");
			System.out.println("Please note: packages have a maximum limit of 10 people.");
			System.out.print("\nHow many people are booking this Safari?: ");
			
			
			int numOfPeople = 0; //throw custom exception if user puts 0 or above 10
			while(true) {
						
				// -------------Since I have a read input method in UserInputController. 
				
				try {
			        numOfPeople = UserInputController.readIntInput(
			            scanner, 1, 10,
			            "\nHow many people are booking this Safari? (1–10): "
			        );
			        break; // valid input, exit loop
			    } catch (InvalidInputException e) {
			        System.out.println(e.getMessage());
			        System.out.print("Please try again.\n");
			    }
				
			}
			
			
			
			//calculate cost depending on number of people
			double packageCost = PackageCost.calculatePackageCost(numOfPeople, selected.getPackageCost());
			
			//Add user's booked package to the hash map
			bookedPackages.put(selected.getId(), selected);
			
			
			//Clean display to show user the details of the SafariPakage they have booked
			String separator = "\n==========================================================\n";

			if (numOfPeople == 1) {
			    System.out.println(separator);
			    System.out.println(" Thank you!! Your package booking has successfully completed. Below are the details:");
			    System.out.printf("   Booking ID: %d%n", selected.getId());
			    System.out.printf("   You have paid: $%.2f for 1 person%n", packageCost);
			    System.out.printf("   Package booked is: %s%n", selected);
			    System.out.println(separator);
			} else {
			    double savings = numOfPeople * selected.getPackageCost() - packageCost;
			    System.out.println(separator);
			    System.out.println(" Thank you!! Your package booking has successfully completed. Below are the details:");
			    System.out.printf("   Booking ID: %d%n", selected.getId());
			    System.out.printf("   You have paid: $%.2f for %d people%n", packageCost, numOfPeople);
			    System.out.printf("   You have saved: $%.2f%n", savings);
			    System.out.printf("   Package booked is: %s%n", selected);
			    System.out.println(separator);
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
