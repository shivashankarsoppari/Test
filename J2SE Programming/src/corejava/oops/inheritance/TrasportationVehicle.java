package corejava.oops.inheritance;

public abstract class TrasportationVehicle extends Vehicle {

	public int getNoOfDoors() {
		return noOfDoors;
	}
	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	public double getLoadCapacity() {
		return loadCapacity;
	}
	public void setLoadCapacity(double loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
	private int noOfDoors;
	private double loadCapacity;
	
}
