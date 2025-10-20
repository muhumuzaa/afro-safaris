package afro_safaris.model;


//extends the standard Safari package but overides the cost by adding 20%
public class LuxurySafariPackkage extends SafariPackage{

	public LuxurySafariPackkage(Destination destination, int duration) {
		super(destination, duration);
		
	}
		@Override
		public double getPackageCost() {
			//parent's packageCost
			double baseCost = super.getPackageCost();
			
			//add extra cost since its luxury
			return baseCost* 1.2;
		}
		
		@Override
		public String toString() {
			return "[Luxury] "+ super.toString(); //prepending to the SafariPackage toString()
		}
	}


