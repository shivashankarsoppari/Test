package corejava.oops.inheritance;

public class Bike extends PassengerVehicle {
	private double saddleHeight;
	
	@Override
	public void start() {
		System.out.println("Bike has started");

	}

	@Override
	public void accelerate() {
		System.out.println("Bike has accelerated");

	}

	@Override
	public void brake() {
		System.out.println("Bike has applied brakes");

	}

	public double getSaddleHeight() {
		return saddleHeight;
	}

	public void setSaddleHeight(double saddleHeight) {
		this.saddleHeight = saddleHeight;
	}

}
