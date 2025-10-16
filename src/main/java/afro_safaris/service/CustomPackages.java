package afro_safaris.service;

import java.util.*;


import afro_safaris.model.Destination;
import afro_safaris.model.SafariPackage;

public class CustomPackages {
	
	public SafariPackage createCustomPackage(Scanner scanner) {
		
		System.out.println("-----------Welcome! Create your own custom package by following the instructions below-----------------");
		
		//importing destinations
		Map<String, String> destinations = Destination.getDestinations();
		
		//getting the keys - which I will use to display the summary info for each destination;
		List<String> keys = new ArrayList<>(destinations.keySet());
		
		//iterates over the destinations HashMap and prints the destination title & summary
		for(int i =0; i <keys.size(); i++) {
			System.out.println(i+1 + ". "+ keys.get(i));
			System.out.println(" " + destinations.get(keys.get(i)));
		}
		
		System.out.println("Choose a destination from the above list: 1 - "+keys.size());
		
		int destChoice = scanner.nextInt();
		scanner.nextLine();
		String destination = keys.get(destChoice - 1);
		
		
		System.out.println("Choose number of days: package durations are between 2 - 7 days");
		int days = scanner.nextInt();
		scanner.nextLine();
		
		
		//calculating the cost
		
		final double basePricePerDay = 200;
		
		Map<String, Double> multipliers = new HashMap<>();
		
		multipliers.put("Serengeti National Park, Tanzania", 1.9);
		multipliers.put("Maasai Mara National Reserve, Kenya", 1.8);
		multipliers.put("Kruger National Park, South Africa", 2.5);
		multipliers.put("Okavango Delta, Botswana", 2.0);
		multipliers.put("Ngorongoro Crater, Tanzania", 1.5);
		multipliers.put("Volcanoes National Park, Rwanda", 1.5);
		
		double multiplier = multipliers.getOrDefault(destination, 1.0);
		double price = days * basePricePerDay * multiplier;
		
		return new SafariPackage(destination, days, price);
	}

}
