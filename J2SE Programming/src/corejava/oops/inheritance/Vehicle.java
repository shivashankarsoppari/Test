package corejava.oops.inheritance;

public abstract class Vehicle {
	private String name;
	private int noOfWheels;
	private String color;
	private String fueltype;
	private double speed;
	
	public abstract void start();
	public abstract void accelerate();
	public abstract void brake();
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	
}
