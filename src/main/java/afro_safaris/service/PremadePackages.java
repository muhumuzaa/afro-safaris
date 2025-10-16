package afro_safaris.service;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import afro_safaris.model.Destination;

public class PremadePackages {
	
	public static Map<Integer, Destination> getPremadePackages(){
		
		Map<Integer, Destination> packages = new HashMap<>();
		
		List<Destination> destinations = Destinations.getDestinations(); //importing the created destinations
		
		/*AtomicInteger is multi-thread safe class for manipulating ints. prevents Race condition in multi thread operations by ensuring an operation 
		is individualized and completed without interruptions from another. eg a++ givng false results; */
		AtomicInteger counter = new AtomicInteger(1); //start from 1
		
		destinations.subList(0, Math.min(3, destinations.size()))
		.forEach(dest -> packages.put(counter.getAndIncrement(), dest)); 
		/*Math.min(3, destinations.size() prevents IndexOutOfBoundsException - since developers are advised not to handle unchecked exceptions but rather 
		 * use better logic to prevent them, I'm doing so here. destinations.subList(0, Math.min(3, destinations.size())) ensures that if destinations are less, the subList will 
		 * always be within the range of the total destinations thus preventing IndexOutOfBoundsException.
		 
		 */
		
		return packages;
		
	}

}
