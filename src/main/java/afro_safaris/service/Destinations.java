package afro_safaris.service;

import java.util.*;

import afro_safaris.model.Destination;

public class Destinations {

	public static List<Destination> getDestinations(){
		
		List<Destination> destinations = new ArrayList<>();
		
		destinations.add( new Destination("Serengeti National Park, Tanzania","The theatre of the Great Migration! 🦓 Endless savanna and Big 5. 🦁🐘", 360.0));
		destinations.add(new Destination("Maasai Mara National Reserve, Kenya","Africa's Big Cat capital and Migration crossing point. 🐆🇰🇪", 380.0));
		destinations.add( new Destination("Kruger National Park, South Africa", "South Africa's flagship reserve. Reliable Big 5 viewing and self-drive options. 🦏", 420));
		destinations.add(new Destination("Okavango Delta, Botswana", "A vast inland river delta explored by mokoro canoe. 🛶 Stunning birdlife and serenity. 🦢", 410));
		destinations.add(new Destination("Ngorongoro Crater, Tanzania","A UNESCO site! 🌋 Dense wildlife and guaranteed Big 5 sightings. ✨", 290));
		destinations.add( new Destination("Volcanoes National Park, Rwanda","Go gorilla trekking! 🦍 Misty forests ⛰️ with endangered mountain gorillas.", 390));
		destinations.add(new Destination("Bwindi Impenetrable National Park", "Gorilla trekking in parks like Bwindi and Mgahinga, and game drives in national parks", 430));
		
		return destinations;
	}
	
	
}
