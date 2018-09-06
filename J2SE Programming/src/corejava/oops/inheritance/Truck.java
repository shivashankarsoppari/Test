package corejava.oops.inheritance;

public class Truck extends TrasportationVehicle {

	private int sizeOfContainer;
	@Override
	public void start() {
		System.out.println("Truck has started");

	}

	@Override
	public void accelerate() {
		System.out.println("Truck has accelerated");

	}

	@Override
	public void brake() {
		System.out.println("Truck has applied brakes");

	}
	public int getSizeOfContainer() {
		return sizeOfContainer;
	}

	public void setSizeOfContainer(int sizeOfContainer) {
		this.sizeOfContainer = sizeOfContainer;
	}

	public void loadContainer()
	{
		System.out.println("Truck load capacity : " + sizeOfContainer);
	}

}
