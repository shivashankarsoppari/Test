package corejava.oops.inheritance;

public class VehicleApp {
	//Execution Logic class
	public static void main(String[] args) {
		Vehicle v;
		//System.out.println("Van detail");
		v = new Van();
		v.setName("Van");
		System.out.println("Name : " + v.getName());
		v.setNoOfWheels(4);
		System.out.println("No of wheels : " + v.getNoOfWheels());
		v.setColor("White");
		System.out.println("Color : " + v.getColor());
		v.setFueltype("Disel");
		System.out.println("Fuel type: " + v.getFueltype());
		v.setSpeed(40.3);
		System.out.println("Speed : " + v.getSpeed() + "kmph");
		//
		v = new Truck();
		v.setName("Truck");
		System.out.println("Name : " + v.getName());
		v.setNoOfWheels(4);
		System.out.println("No of wheels : " + v.getNoOfWheels());
		v.setColor("Blue");
		System.out.println("Color : " + v.getColor());
		v.setFueltype("Disel");
		System.out.println("Fuel type: " + v.getFueltype());
		v.setSpeed(15.2);
		System.out.println("Speed : " + v.getSpeed() + "kmph");
		//
		v = new Car();
		v.setName("Audi");
		System.out.println("Name : " + v.getName());
		v.setNoOfWheels(4);
		System.out.println("No of wheels : " + v.getNoOfWheels());
		v.setColor("Gray");
		System.out.println("Color : " + v.getColor());
		v.setFueltype("Petrol");
		System.out.println("Fuel type: " + v.getFueltype());
		v.setSpeed(240);
		System.out.println("Speed : " + v.getSpeed() + "kmph");
		//
		v = new Bike();
		v.setName("Royal Enfield");
		System.out.println("Name : " + v.getName());
		v.setNoOfWheels(2);
		System.out.println("No of wheels : " + v.getNoOfWheels());
		v.setColor("Gray");
		System.out.println("Color : " + v.getColor());
		v.setFueltype("Petrol");
		System.out.println("Fuel type: " + v.getFueltype());
		v.setSpeed(140);
		System.out.println("Speed : " + v.getSpeed() + "kmph");
		

	}

}
