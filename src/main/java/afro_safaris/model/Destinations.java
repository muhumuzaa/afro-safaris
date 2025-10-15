package afro_safaris.model;

import java.util.HashMap;
import java.util.Map;

public class Destinations {
	
	public static Map<String, String> getDestinations(){
		
		Map<String, String> destinations = new HashMap<>();
		
		
		destinations.put("Serengeti National Park, Tanzania", "The theatre of the Great Migration! 🦓 wildebeest crossing the plains in an epic, dramatic spectacle. Endless savanna and Big 5. 🦁🐘");
		destinations.put("Maasai Mara National Reserve, Kenya", "Africa's Big Cat capital and Migration crossing point. Combine iconic wildlife sightings with cultural visits to the Maasai people. 🐆🇰🇪 A classic!");
		destinations.put("Kruger National Park, South Africa", "South Africa's flagship reserve. Reliable Big 5 viewing and self-drive options 🚘 make it great for first-timers and budget-conscious adventurers. 🦏");
		destinations.put("Okavango Delta, Botswana", "A vast inland river delta where wildlife is viewed by traditional mokoro canoe. 🛶 Unique water-based safaris offer serenity and stunning birdlife. 🦢");
		destinations.put("Ngorongoro Crater, Tanzania", "A UNESCO world heritage site! 🌋 The world's largest intact caldera is a natural enclosure for dense, guaranteed Big 5 sightings. Breathtaking views. ✨");
		destinations.put("Volcanoes National Park, Rwanda", "Go gorilla trekking! 🦍 Hike the misty forests ⛰️ to spend an hour with endangered mountain gorillas. A deeply moving, bucket-list primate experience.");
		
		return destinations;
	}

}
