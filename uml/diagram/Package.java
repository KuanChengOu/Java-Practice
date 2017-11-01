package uml.diagram;

public class Package {

	private double price = 0.0;
	private String description = "";
	
	public Package () {
	}
	
	public Package (double price, String description) {
		this.price = price;
		this.description = description;
	}
	
	public void setPrice (double price) {
		this.price = price;
	}
	
	public double getPrice () {
		return this.price;
	}
	
	public void setDescription (String description) {
		this.description = description;
	}
	
	public String getDescription () {
		return this.description;
	}
	
	@Override
	public String toString() {
		
		return	"# Price: " + getPrice() 
				+ ", Description: " + getDescription();	
	}
}
