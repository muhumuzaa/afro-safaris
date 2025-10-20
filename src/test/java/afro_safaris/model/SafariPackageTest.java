package afro_safaris.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SafariPackageTest {
	
	//Test the cost of a package for 3 days
	@Test
	void testPackageCostCalculation() {
		Destination dstn = new Destination("Sample destination", "Sample place", 200.0);
		SafariPackage pkg = new SafariPackage(dstn, 3); 
		assertEquals(600.0, pkg.getPackageCost(), 0.01);
	}

}
