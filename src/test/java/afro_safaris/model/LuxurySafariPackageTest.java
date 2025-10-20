package afro_safaris.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class LuxurySafariPackageTest {
	
	//this test is for polymorphism: packageCost works different on standard and luxury packages
	@Test
	void testLuxuryPackageExtraCost() {
		Destination dstn = new Destination("Luxury destn", "luxury place", 200.0);
		SafariPackage lux = new LuxurySafariPackage(dstn, 3); //reference type is parent, object is child
		
		//normal price should be 3*200 = 600.
		//luxury adds 20% = 720
		assertEquals(720, lux.getPackageCost(), 0.01);
	}
	
	
	//testing polymorphism- getPackageCost() acts different on the 2 types of SafariPackages
	@Test
	void testLuxuryPackagePolymorphism() {
		Destination dstn = new Destination("Luxury destn", "luxury place", 200.0);
		SafariPackage lux = new LuxurySafariPackage(dstn, 2);
		
		double cost = lux.getPackageCost(); 
		
		//normal price should be 2*200 = 400.
				//luxury adds 20% = 480
		assertEquals(480, cost, 0.01);
	}

}
