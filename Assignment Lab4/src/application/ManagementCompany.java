package application;

public class ManagementCompany {
private final int  MAX_PROPERTY = 5;
private double mgmFeePer;
private String name;
private Property[] properties;
private String taxID;
private final int MGMT_WIDTH = 10;
private  final int MGMT_DEPTH = 10;
private int index;
private Plot plot;
public ManagementCompany() {
 properties = new Property[MAX_PROPERTY];
	name = "";
	taxID = "";
	mgmFeePer = 0.0;
	index = 0;
	plot = new Plot();

}
public ManagementCompany(java.lang.String name,  java.lang.String taxID, double mgmFee) {
	properties = new Property[MAX_PROPERTY];
   this.name = name;
   this.taxID = taxID;
   this.mgmFeePer = mgmFee;
   index = 0;
   plot = new Plot();
}
public ManagementCompany(java.lang.String name,java.lang.String taxID,double mgmFee,int x,int y,int width,int depth){
	this.name = name;
	this.taxID = taxID;
	mgmFeePer = mgmFee;
	 plot = new Plot(x,y,width,depth);
	 index = 0;
	 properties = new Property[MAX_PROPERTY];
}
public ManagementCompany(ManagementCompany otherCompany) {
	this.name = otherCompany.name;
	this.taxID = otherCompany.taxID;
	this.mgmFeePer = otherCompany.mgmFeePer;
	index = 0;
	properties = new Property[MAX_PROPERTY];
	plot = new Plot();
}

public int addProperty(Property property) {
 
    if( index >= MAX_PROPERTY) {
    	return -1;
    }
    if(property == null) {
    	return -2;
    }
  if(this.plot.encompasses(property.getPlot())) {
	  return -3;
  } 
	  
 
  if( index > 0) {
  for( int x = 0; x < index; x++) {
	  if(property.getPlot().overlaps( properties[x].getPlot())) {
		  return -4;
	  		}
  		}
	 }
	  
              if(index < MAX_PROPERTY) {
		      properties[index] = property;
		            index++;
		      
                   }
	
	return index-1;
	
}
public int addProperty(String name,String city,double rent,String owner) {
	    Property property = new Property(name,city,rent,owner);
	    if( index >= MAX_PROPERTY) {
	    	return -1;
	    }
	  if(this.plot.encompasses(property.getPlot())) {
		  return -3;
	  }
	  if(index >  0) {
		  for( int x = 0; x < index; x++) {
			  	if(property.getPlot().overlaps(properties[x].getPlot())) {
			  			return -4;
			  	}
		  }
	  }
	
	    if( index < MAX_PROPERTY) {
	    	properties[index] = property;
	    	return index++;
	    }
	return index-1;
}
public int addProperty(String name,String city,double rent,String owner,int x,int y,int width,int depth) {
	    Property property = new Property(name,city,rent,owner,x,y,width,depth);
	    if( index >= MAX_PROPERTY) {
	    	return -1;
	    }
	  if(this.plot.encompasses(property.getPlot())) {
		  return -3;
	  }
	  if(index >  0) {
		  for( int i = 0; i < index; i++) {
			  	if(property.getPlot().overlaps(properties[i].getPlot())) {
			  			return -4;
			  	}
		  }
	  }
	    if(index < MAX_PROPERTY) {
	    	properties[index] = property;
	    	return index++;
	    }
	return index-1;
}
 public String displayPropertyAtIndex(int i){
	String c = "";
	for( int x = 0; x < properties.length; x++) {
		 if(x == i) {
			c = properties[x].toString();
		 }
	}
	return c;
}
public int getMAX_PROPERTY() {
	return MAX_PROPERTY;
}
public double maxRentProp() {
	double max = 0;
	for( int x = 0; x <MAX_PROPERTY; x++){
		if( properties[x].getRentAmount() > max) {
			max = properties[x].getRentAmount();
			    
		}
	}
	return max;
}
public int maxRentPropertyIndex() {
	int maxIndex = 0;
	
	for(int x = 0; x < properties.length; x++){
		if( properties[x].getRentAmount() > maxIndex) {
			maxIndex = x;
		}
	}
	return maxIndex;
}
public  double TotalMangmentFee() {
	
	double total = (mgmFeePer*this.totalRent())/100;
	
	return total;
}
public String toString(){
	  String mang = "";
	for( int x = 0; x < properties.length; x++) {
	  mang += properties[x].toString()+"\n";
	 
	}
	return "List of Properties for "+ this.name+", taxID: "+this.taxID
	+"\n\n--------------------------------------------\n"+mang+"\n----------------------------------------------\n\n"
	+"total management Fee: "+this.TotalMangmentFee();
}
public double totalRent() {
	double total = 0;
	for( int x = 0; x < MAX_PROPERTY ; x++) {
		total+= properties[x].getRentAmount();
		
	}
	
	return total;
}
public Plot getPlot() {
	return plot;
}
public String getName() {
	return name;
}
public String getTaxId() {
	return taxID;
}




}
