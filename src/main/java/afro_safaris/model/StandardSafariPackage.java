package afro_safaris.model;



//implements the super SafariPackage abstract class and implements its own getPackageCost()
public class StandardSafariPackage extends SafariPackage{

	
	public StandardSafariPackage( Destination destination, int duration) {
		super(destination, duration);
	}
	

	//its own implementation of getPackageCost() from SafariPackage. Different from LuxurySafariPackage
	@Override
	public double getPackageCost() {
		return getDuration() * getDestination().getBasePricePerDay();
	}


}
