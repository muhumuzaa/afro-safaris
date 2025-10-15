package afro_safaris.model;

import java.util.*;


//This class defines the structure of a Safari Package/ entity
public class SafariPackage {
	private String country;
	private String destination;
	private int duration;
	List<String> activities;
	private double price;
	
	public SafariPackage(String country, String destination, int duration, List<String> activities, double price) {
		this.country = country;
		this.destination = destination;
		this.duration = duration;
		this.activities = activities;
		this.price = price;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
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

	public List<String> getActivities() {
		return activities;
	}

	public void setActivities(List<String> activities) {
		this.activities = activities;
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
		return String.format("\n Country: %s | Destination: %s | Duration: %d days | Activities: %s | Price: $%.2f", country, destination, duration, String.join(", ", activities), price);
	}
	
	

}
