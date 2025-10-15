package afro_safaris;

import java.util.Iterator;

import afro_safaris.model.SafariPackage;
import afro_safaris.service.PremadePackages;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SafariPackage[] packages = PremadePackages.getPremadePackages();
		
		for(SafariPackage spk: packages) {
			System.out.println(spk);
		}
	}

}
