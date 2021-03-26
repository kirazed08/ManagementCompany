package application;

public class Property {
	private java.lang.String city;
	private java.lang.String owner;
	private java.lang.String propertyName;
	private double rentAmount;
	private Plot plot;
	
	public Property() {
		rentAmount = 0;
		city ="";
		owner ="";
		propertyName ="";
		plot = new Plot(0,0,1,1);
		
	}
public Property(Property p) {
		this.city = p.city;
		this.owner = p.owner;
		this.propertyName = p.propertyName;
		this.rentAmount = p.rentAmount;
}
	public Property(String propertyName, String city, double rentAmount,String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.owner = owner;
		this.rentAmount = rentAmount;
		
	}
	public Property(String propertyName, String city, double rentAmount,String owner, int x, int y, int width, int depth){
		this.propertyName = propertyName;
		this.city = city;
		this.owner = owner;
		this.rentAmount = rentAmount;
	  plot = new Plot(x,y,width,depth);
	
		}
	public Property(String propertyName, String city, double rentAmount,String owner, int x, int y, int width, int depth, String name, String taxID, int mgmFee) {
		this.propertyName = propertyName;
		this.city = city;
		this.owner = owner;
		this.rentAmount = rentAmount;
	  plot = new Plot(x,y,width,depth);
	
	}
	public java.lang.String getCity() {
		return city;
	}
	public java.lang.String getOwner() {
		return owner;
	}
	public java.lang.String getPropertyName() {
		return propertyName;
	}
	public double getRentAmount() {
		return rentAmount;
	}
	public Plot setplot(int x, int y, int width, int depth) {
		plot = new Plot(x,y,width,depth);
	         		return plot;
	}
	
	
	public Plot getPlot() {
		return new Plot(plot);
	}
		
	public void setOwner(java.lang.String owner) {
		 this.owner = owner;
	}
	public void setPropertyName(java.lang.String propertyName) {
		this.propertyName = propertyName;
	}
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	public String toString() {
		String property ="";
	
		property = "\npropert Name: "+ this.propertyName+"\n Located in: "+city+"\n Belonging to: "+owner
				+"\n Rent Amount: "+rentAmount;
		return property;
	}
	
	}


