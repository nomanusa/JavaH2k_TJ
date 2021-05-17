package Session13;

public class Vehicles {
	
	int noOfWheels=8;
	
	public void vehiclesTypes()
	{
		System.out.println("I am generic vehicles");
	}
	public static void main(String[] args) {
		
		Vehicles car=new Vehicles();
		Vehicles bus=new Vehicles();
		Vehicles truck=new Vehicles();
		
		car.vehiclesTypes();
		bus.vehiclesTypes();
		car.vehiclesTypes();
	}

}
