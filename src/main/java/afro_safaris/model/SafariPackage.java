package afro_safaris.model;

import java.util.*;

public class SafariPackage {
	
	private String destination;
	private int duration;
	List<String> activities;
	private double price;
	
	public SafariPackage(String destination, int duration, List<String> activities, double price) {
		super();
		this.destination = destination;
		this.duration = duration;
		this.activities = activities;
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
	
	@Override
	public String toString() {
		return String.format("Destination: %s | Duration: %d days | Activities: %s | Price: $%.2f", destination, duration, String.join(", ", activities), price);
	}
	
	

}
