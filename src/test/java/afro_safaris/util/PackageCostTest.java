package afro_safaris.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PackageCostTest {

	//tests PackageCost utility class
	
	//test1
	@Test
	void testSinglePersonNoDiscount() {
		// One person should pay the full package price- no discount
		double cost = PackageCost.calculatePackageCost(1, 100.0);
		assertEquals(100.0, cost, 0.01);
	}
	
	//test2
	@Test
	void testTwoPeopleGetDiscount() {
		//for 2 people, 1 person pays full price but second person pays 90% - gets a 10% discount
		double cost = PackageCost.calculatePackageCost(2, 100.0);
		assertEquals(190.0, cost, 0.01);
	}
}
