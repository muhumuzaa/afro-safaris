package afro_safaris.model;


//extends the standard Safari package but overides the cost by adding 20%
public class LuxurySafariPackage extends SafariPackage{

	public LuxurySafariPackage(Destination destination, int duration) {
		super(destination, duration);
		
	}
		@Override
		public double getPackageCost() {
			//normal packageCost
			double luxCost = getDuration()*getDestination().getBasePricePerDay() ;
			
			//add extra cost since its luxury
			return luxCost* 1.2;
		}
		
		@Override
		public String toString() {
			return "[Luxury] "+ super.toString(); //prepending to the SafariPackage toString()
		}
	}


