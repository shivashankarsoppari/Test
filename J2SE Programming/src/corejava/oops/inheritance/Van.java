package corejava.oops.inheritance;

public class Van extends TrasportationVehicle {
	int noOfBoxes;
	@Override
	public void start() {
		System.out.println("Van has started");

	}

	public int getNoOfBoxes() {
		return noOfBoxes;
	}

	public void setNoOfBoxes(int noOfBoxes) {
		this.noOfBoxes = noOfBoxes;
	}

	@Override
	public void accelerate() {
		System.out.println("Van has accelerated");

	}

	@Override
	public void brake() {
		System.out.println("Van has applied brakes");

	}
	public void loadVan()
	{
		System.out.println("load : " + noOfBoxes);
	}

}
