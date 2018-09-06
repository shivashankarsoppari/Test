package corejava.oops.inheritance;

public class Car extends PassengerVehicle {

	private int noOfDoors;
	@Override
	public void start() {
		System.out.println("Car has started");

	}

	@Override
	public void accelerate() {
		System.out.println("Car has accelerated");
	}

	@Override
	public void brake() {
		System.out.println("Car has applied brakes");
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

}
