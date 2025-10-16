package afro_safaris.model;



//This class defines the structure of a Safari Package/ entity
public class SafariPackage {
	private int id;
	private Destination destination;
	private int duration;
	
	public SafariPackage(int id, Destination destination, int duration) {
		this.id = id;
		this.destination = destination;
		this.duration = duration;
	}
	

	public int getId() {
		return this.id;
	}
	
	public Destination getDestination() {
		return destination;
	}

//	public void setDestination(String destination) {
//		this.destination = destination;
//	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}


	//I'm calculting the cost of a package. Duration already has the cost of a destination.
	public double getPackageCost() {
		return duration * destination.getBasePricePerDay();
	}


	
	//overriding toString() to get a custom print output when I print the packages. I'm appending to the destination's toString() method.
	@Override
	public String toString() {
		return String.format("%s | Duration: %d days | Total cost: $%.2f", destination.toString(), getPackageCost());
				
	}
	
}
