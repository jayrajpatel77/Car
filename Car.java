
public class Car extends Vechicle implements Drivable, Comparable {
	
	
	private String model;
	private int speed;
	
	
	public Car(String model, int speed) {
		super();
		this.model=model;
		this.speed=speed;
	}


	public  void setModel(String model) {
		this.model=model;
		
	}

	

	public void setSpeed(int speed) {
		this.speed=speed;
		
	}
	public int getSpeed() {
		return speed;
		
	}
	public String getModel() {
		return model;
	}
	public boolean equals(Car car) {
	if (car instanceof Vechicle) {
		Vechicle v =(Vechicle)car;
		car.getModel().equals(this.model);
		return true;
	}
		
		
		else return false;
		
	}
	
	public void steer() {
		System.out.println("Turn Steering wheel");
	}
	
	
	public String howToDrive() {
		return "Step on gas pedal";
	}


	@Override
	public int compareTo(Object o) {
		Car car =(Car)o;
		if(this.speed>car.getSpeed()) {
			return 1;
		}else if(this.speed<car.getSpeed()) {
			return -1;
		}
		else return 0;
		
		
	}
		

}
