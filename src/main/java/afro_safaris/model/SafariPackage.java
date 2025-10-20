package afro_safaris.model;



//Making this the abstract of Safari packages. Then I create Standard and Luxury Safari Packages that extend this one.
public abstract class SafariPackage {
	private static int counter = 1; //globally increments the id with each object created
	
	private int id;
	private Destination destination;
	private int duration;
	
	public SafariPackage( Destination destination, int duration) {
		this.id = counter++;
		this.destination = destination;
		this.duration = duration;
	}
	

	public int getId() {
		return this.id;
	}
	
	public Destination getDestination() {
		return destination;
	}


	public int getDuration() {
		return duration;
	}



	//Leaving this as an abstract method. Each subclass will have its own implementation of this method
	public abstract double getPackageCost();
	

	
	//overriding toString() to get a custom print output when I print the packages. I'm appending to the destination's toString() method.
	@Override
	public String toString() {
		return String.format("%s | Duration: %d days | Total cost/person: $%.2f",  destination.toString(), duration, getPackageCost());
				
	}
	
}
