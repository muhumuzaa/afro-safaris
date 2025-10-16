package afro_safaris;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import afro_safaris.model.Destination;
import afro_safaris.model.SafariPackage;
import afro_safaris.service.PremadePackages;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, Destination> safariPackakges = PremadePackages.getPremadePackages();
		
		for(Map.Entry<Integer, Destination> entry: safariPackakges.entrySet()) {
			
			int pkgNumber = entry.getKey();
			Destination destination = entry.getValue();
			
			
			System.out.println(pkgNumber +". "+destination);
		}

	}

}
