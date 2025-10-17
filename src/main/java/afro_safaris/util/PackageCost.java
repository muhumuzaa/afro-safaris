package afro_safaris.util;


//TODO create a JUNIT test for this method
public class PackageCost {

	public static double calculatePackageCost(int numberOfPeople, double baseCost) {
		if(numberOfPeople ==1) {
			return baseCost;
		}
		
		double total = baseCost; //first person pays base price but every extra person gets a 10% discount
		for(int i =1; i <numberOfPeople; i++) {
			total += baseCost *0.9;
		}
		return total;
	}
}
