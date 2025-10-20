package afro_safaris.service;

import java.util.*;

import afro_safaris.exception.InvalidInputException;
import afro_safaris.model.Destination;
import afro_safaris.model.SafariPackage;
import afro_safaris.util.UserInputController;

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
		int userChoice = UserInputController.readIntInput(scanner, 1, destinations.size(), "\nEnter your Destination choice: ");
		
		
		Destination chosenDestination = destinations.get(userChoice -1); // -1 Because the displayed destinations start from 1 but the destinations List starts from index 0;
		
		//Ask user to add number of days they want to book a package for
		int numOfDays = UserInputController.readIntInput(scanner, 2, 10, "\nEnter number of days you want to book for: You can book between 2- 10 days: ");

		
		//Creating the custom SafariPackage object depending on the user's choices. And displaying it for the user
		SafariPackage createdCustomePackage = new SafariPackage(chosenDestination, numOfDays);
		System.out.println("\n Your custom Safari Package has been created.");
		
		
		return createdCustomePackage ;
		
	}
	

}
