package afro_safaris.model;

import java.util.*;


//This class defines the structure of a Safari Package/ entity
public class SafariPackage {
	private Destination destination;
	private int duration;
	private double price;
	
	public SafariPackage(Destination destination, int duration, double price) {
		this.destination = destination;
		this.duration = duration;
		this.price = price;
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



	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	//overriding toString() to get a custom print output when I print the packages
	@Override
	public String toString() {
		return String.format("\n Destination: %s | Duration: %d days | Price: $%.2f",  destination, duration, price);
	}
	
	

}
