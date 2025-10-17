package afro_safaris.service;

import java.util.*;


import afro_safaris.model.Destination;
import afro_safaris.model.SafariPackage;

public class CustomPackageService {
	
	public static SafariPackage createPackage(Scanner scanner){
		
		
		System.out.println("---------------  Customize and book your dream Safari package   ---------------------------");
		List<Destination> destinations = Destinations.getDestinations();
		
		
		//Display destinations a user can choose from
		System.out.println("Choose a destination: (1 - "+ destinations.size() + " )");
		
		for(int i =0; i <destinations.size(); i++) {
			Destination dest = destinations.get(i);
			System.out.print(i+1 + ". "+dest.getTitle());
			System.out.println("	"+dest.getSummary());
			System.out.println("    Rate: $"+dest.getBasePricePerDay() +" /day\n");
		}
		
		
		int choice = scanner.nextInt();
		scanner.nextLine();
		Destination chosenDest = destinations.get(choice -1);
		
		System.out.println("Choose the duration of your package. (2 - 7 days)");
		int days = scanner.nextInt();
		scanner.nextLine();
		
		//create a new customPackage
		SafariPackage customPackage = new SafariPackage(chosenDest, days);
		return customPackage;
	}

}
