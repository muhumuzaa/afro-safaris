package afro_safaris.service;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import afro_safaris.model.Destination;
import afro_safaris.model.LuxurySafariPackage;
import afro_safaris.model.SafariPackage;
import afro_safaris.model.StandardSafariPackage;

public class PremadePackageService {
	
	
	public static List<SafariPackage> createPremadePackages() {
		
		List<Destination> destinations = Destinations.getDestinations(); //Getting all destinations
		
		List<SafariPackage> packages = new ArrayList<>(); //creating an ArrayList of packages that I'm going to populating with 3 premade packages
		
		for(int i=0; i <Math.min(4, destinations.size()); i++) {
			
			int randomDay = (int)(Math.random()*8) +3; //Math.random creates doubles of 0 -0.99... I cast it to int and add 3. so the range of days is always 3 to 10 days
			/*Math.min(3, destinations.size() prevents IndexOutOfBoundsException - since developers are advised not to handle unchecked exceptions but rather 
//			 * use better logic to prevent them, I'm doing so here. Math.min(3, destinations.size()) ensures that if destinations are less than 3, the loop runs 2times.
//			 * It will always be within the range of the total destinations thus preventing IndexOutOfBoundsException.
//			 
//			 */
			
			if(i%2 ==0) {
				//every 2nd package is a luxury package
				packages.add(new LuxurySafariPackage(destinations.get(i), randomDay));
			}else {
			
				//its a standard package
			packages.add(new StandardSafariPackage(destinations.get(i), randomDay)); 
			}
		}
		return packages; 
	}

}
