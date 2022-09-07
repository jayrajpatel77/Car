import java.util.Date;

public class Test {
	
	public static void main(String args[]) {
		Car c1 = new Car("X-class", 215);
		c1.setColor("Red");
		c1.setManufactureDate(new Date(2022,9,9));
		
		Car c = new Car("Y-class", 205);
		c.setColor("blue");
		c.setManufactureDate(new Date(2021,1,9));
		
		Car c2 = new Car("Z-class", 195);
		c.setColor("Orange");
		c.setManufactureDate(new Date(2021,10,19));
		
		Car c3 = new Car("Y-class", 205);
		c.setColor("blue");
		c.setManufactureDate(new Date(2021,1,9));
		
		
		System.out.println("Car1 Model "+c1.getModel()+" Top speed "+ c1.getSpeed()+" color "+ c1.getcolor()+" Date "+ c1.getManufactureDate());
		System.out.println("Car Model "+c.getModel()+" Top speed "+ c.getSpeed()+" color "+ c.getcolor()+" Date "+ c.getManufactureDate());
		System.out.println("Car2 Model "+c2.getModel()+" Top speed "+ c2.getSpeed()+" color "+ c2.getcolor()+" Date "+ c2.getManufactureDate());
		System.out.println("Car3 Model "+c3.getModel()+" Top speed "+ c3.getSpeed()+" color "+ c3.getcolor()+" Date "+ c3.getManufactureDate());
		
		if(c1.equals(c2)) {
			System.out.print("Car1 and Car2 is same");
		} else 
			System.out.print("Car1 and Car2 is not same");
		
		if(c.equals(c3)) {
			System.out.print("Car and Car3 is same");
		} else 
			System.out.print("Car and Car3 is not same");
		
		
		if(c1.compareTo(c2)>0) {
			System.out.println("Car1 is faster than car2");
		}else if(c1.compareTo(c2)<0) {
			System.out.print("Car2 is faster than car1");
		}
	}

}
