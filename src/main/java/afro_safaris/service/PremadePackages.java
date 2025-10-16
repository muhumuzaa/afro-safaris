package afro_safaris.service;

import java.util.Arrays;

import afro_safaris.model.SafariPackage;

public class PremadePackages {
	
	public static SafariPackage[] getPremadePackages() {
		return new SafariPackage[] {
				new SafariPackage("Serengeti & Ngorongoro, Tanzania", 7, 4000),
				new SafariPackage( "Masai Mara, Kenya", 4, 2200),
				new SafariPackage("Kruger National Park, South Africa", 5, 3000 ),
				new SafariPackage("Bwindi Impenetrable National Park, Uganda", 3, 1500 ),
				new SafariPackage("Chobe & Victoria Falls, Botswana/Zimbabwe/Zambia", 6, 4500 )
				
		};
	}

}
