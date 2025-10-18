package afro_safaris.service;

import java.util.*;

import afro_safaris.exception.BadInputException;
import afro_safaris.exception.InvalidDaysException;
import afro_safaris.model.Destination;
import afro_safaris.model.SafariPackage;

public class CustomPackageService {
	
	public static SafariPackage createPackage(Scanner scanner){
		
		
		System.out.println("\n---------------  Customize and book your dream Safari package   ---------------------------\n");
		List<Destination> destinations = Destinations.getDestinations();
		
		
		//Display destinations a user can choose from
		System.out.println("Choose a destination: (1 - "+ destinations.size() + " )\n");
		
		for(int i =0; i <destinations.size(); i++) {
			Destination dest = destinations.get(i);
			System.out.print(i+1 + ". "+dest.getTitle());
			System.out.println("	"+dest.getSummary());
			System.out.println("    Rate: $"+dest.getBasePricePerDay() +" /day\n");
		}
		
		//Ask user to choose a destination
		int userChoice = readIntInput(scanner, 1, destinations.size(), "\nEnter your Destination choice: ");
		
		
		Destination chosenDestination = destinations.get(userChoice -1); // -1 Because the displayed destinations start from 1 but the destinations List starts from index 0;
		
		//Ask user to add number of days they want to book a package for
		int numOfDays = readIntInput(scanner, 2, 10, "\nEnter number of days you want to book for: You can book between 2- 10 days: ");

		
		//Creating the custom SafariPackage object depending on the user's choices. And displaying it for the user
		SafariPackage createdCustomePackage = new SafariPackage(chosenDestination, numOfDays);
		System.out.println("\n Your custom Safari Package has been created.");
		
		
		return createdCustomePackage ;
		
	}
	
	/*This function prevents app from crushing due to exceptions like IndexOutOfBoundsException(user putting 10 yet the list has only 6 destinations) or 
	 * InputMismatchException (string instead of int). 
	 */
	public static int readIntInput(Scanner scanner, int min, int max, String prompt) {
		
		int value;
		while(true) {
			System.out.println(prompt); //show user a prompt
			
			if(scanner.hasNextInt()) {
				value = scanner.nextInt(); //check if user input in int. prevents app crash if user enters string or other data types; 
				scanner.nextLine();
				if(value >=min && value <=max) { //check user input is between the limits required. e.g 
					return value;
				}else {
					throw new InvalidDaysException("Please enter a number between "+min +" and "+max+".");
				}
			}else {
				scanner.nextLine();// consumes the invalid input
				throw new BadInputException("Invalid input! Please enter a number");
				
			}
		}
	}

}
