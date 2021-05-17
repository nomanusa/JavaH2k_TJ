package Session15;

public class Car extends Vehicle {
	
	public void wheels()
	{
		System.out.println("I have 4 wheels");
	}

	public static void main(String[] args) {
	
		Car obj = new Car();
		obj.wheels();

	}

}
