package afro_safaris;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import afro_safaris.model.SafariPackage;
import afro_safaris.service.PremadePackages;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		SafariPackage[] packages = PremadePackages.getPremadePackages();
//		
//		for(SafariPackage spk: packages) {
//			System.out.println(spk);
//		}
		
		Map<String, Integer> ages = new HashMap<>();
			ages.put("Reign", 900); 
			ages.put("Cortez", 900);
			
			for(String name: ages.keySet()) {
				System.out.println("Name: "+name);
			}
	}

}
