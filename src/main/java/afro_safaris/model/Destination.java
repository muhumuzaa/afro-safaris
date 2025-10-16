package afro_safaris.model;

import java.util.HashMap;
import java.util.Map;

public class Destination {
	private String title;
	private String summary;
	private double basePricePerDay;
	
	public Destination(String title, String summary, double basePricePerDay) {
		this.title = title;
		this.summary = summary;
		this.basePricePerDay = basePricePerDay;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getSummary() {
		return this.summary;
	}
	
	public double getBasePricePerDay() {
		return this.basePricePerDay;
	}
}
