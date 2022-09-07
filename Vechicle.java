import java.util.Date;

public abstract class Vechicle {
	
	private String color;
	private Date manufactureDate;
	
	public Vechicle() {
		this.color=color;
		this.manufactureDate=manufactureDate;
	}
	
	
	public void steer() {
		
	}
	
	public void setColor(String color) {
		this.color=color;
	}

	public void setManufactureDate(java.util.Date date) {
		this.manufactureDate=manufactureDate;
	}
	
	public Date getManufactureDate() {
		return manufactureDate;
	}
	
	public String getcolor() {
		return color;
	}
	
	

}
