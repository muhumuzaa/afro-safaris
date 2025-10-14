package afro_safaris.service;

import java.util.Arrays;

import afro_safaris.model.SafariPackage;

public class PremadePackages {
	
	public SafariPackage[] getPremadePackages() {
		return new SafariPackage[] {
				new SafariPackage("Tanzania","Serengeti & Ngorongoro", 7, Arrays.asList("Game Drive", "Cultural Visit", "Hot Air Balloon"), 4000),
				new SafariPackage("Kenya", "Masai Mara", 4, Arrays.asList("Game Drive", "Maasai Village Visit", "Wildebeest Migration Viewing"), 2200),
				new SafariPackage("South Africa", "Kruger National Park", 5, Arrays.asList("Game Drive", "Bush Walk", "Big 5 Tracking"), 3000 ),
				new SafariPackage("Uganda", "Bwindi Impenetrable National Park", 3, Arrays.asList("Gorilla Trekking", "Community Walk"), 1500 ),
				new SafariPackage("Botswana/Zimbabwe/Zambia", "Chobe & Victoria Falls", 6, Arrays.asList("Boat Cruise", "Game Drive", "Victoria Falls Tour"), 4500 )
				
		};
	}

}
