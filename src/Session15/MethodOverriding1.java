package Session15;

public class MethodOverriding1 extends MethodOverriding {
	
	public void printName()
	{
		System.out.println("AB");
	}
	
	public static void main(String[] args) {
		
		MethodOverriding1 obj=new MethodOverriding1();
		obj.printName();
		obj.add(5, 3);
		obj.add(8, 9, 6);
		obj.add(2.32, 5.32);
		
		
		
	}

}
