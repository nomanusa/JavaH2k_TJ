package Session15;

public class Bike extends Vehicle {
	
	public void wheels()
	{
		System.out.println("I have 2 wheels");
	}
	
	public static void main(String[] args) {
		
		Bike obj= new Bike();
		obj.wheels();
	}


}
