package afro_safaris.model;


public class Destination {
	private int id;
	private String title;
	private String summary;
	private double basePricePerDay;
	
	public Destination( int id, String title, String summary, double basePricePerDay) {
		this.id = id;
		this.title = title;
		this.summary = summary;
		this.basePricePerDay = basePricePerDay;
	}
	
	public int getId() {
		return this.id;
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
	
	@Override
	public String toString() {
		
		return title + " -- "+summary ; 
	}
}
