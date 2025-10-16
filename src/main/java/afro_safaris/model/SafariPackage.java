package afro_safaris.model;

import java.util.*;


//This class defines the structure of a Safari Package/ entity
public class SafariPackage {
	private String destination;
	private int duration;
	private double price;
	
	public SafariPackage(String destination, int duration, double price) {
		this.destination = destination;
		this.duration = duration;
		this.price = price;
	}
	

	
	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

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
