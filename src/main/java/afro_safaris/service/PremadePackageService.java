package afro_safaris.service;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import afro_safaris.model.Destination;
import afro_safaris.model.SafariPackage;

public class PremadePackageService {
	
//	public static Map<Integer, Destination> getPremadePackages(){
//		
//		Map<Integer, Destination> packages = new HashMap<>();
//		
//		List<Destination> destinations = Destinations.getDestinations(); //importing the created destinations
//		
//		/*AtomicInteger is multi-thread safe class for manipulating ints. prevents Race condition in multi thread operations by ensuring an operation 
//		is individualized and completed without interruptions from another. eg a++ givng false results; */
//		AtomicInteger counter = new AtomicInteger(1); //start from 1
//		
//		destinations.subList(0, Math.min(3, destinations.size()))
//		.forEach(dest -> packages.put(counter.getAndIncrement(), dest));
//		/*Math.min(3, destinations.size() prevents IndexOutOfBoundsException - since developers are advised not to handle unchecked exceptions but rather 
//		 * use better logic to prevent them, I'm doing so here. destinations.subList(0, Math.min(3, destinations.size())) ensures that if destinations are less, the subList will 
//		 * always be within the range of the total destinations thus preventing IndexOutOfBoundsException.
//		 
//		 */
//		
//		return packages;
//		
//	}
	
	public static List<SafariPackage> createPremadePackages() {
		
		List<Destination> destinations = Destinations.getDestinations(); //Getting all destinations
		
		List<SafariPackage> packages = new ArrayList<>(); //creating an ArrayList of packages that I'm going to populating with 3 premade packages
		
		for(int i=0; i <Math.min(3, destinations.size()); i++) {
			
			int randomDay = (int)(Math.random()*10) +3; //Math.random creates doubles of 0 -0.99... I cast it to int and add 3. so the range of days is always 3- 10 days
			/*Math.min(3, destinations.size() prevents IndexOutOfBoundsException - since developers are advised not to handle unchecked exceptions but rather 
//			 * use better logic to prevent them, I'm doing so here. Math.min(3, destinations.size()) ensures that if destinations are less than 3, the loop runs 2times.
//			 * It will always be within the range of the total destinations thus preventing IndexOutOfBoundsException.
//			 
//			 */
			packages.add(new SafariPackage(destinations.get(i), randomDay)); //Creating n ~3 packages of SafariPackage type
		}
		return packages; 
	}

}
