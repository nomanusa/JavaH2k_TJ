package Session14;

public class Child extends Parent {
	
	public void childSummary ()
	{
		System.out.println("I am child method");
	}

	public static void main(String[] args) {
		
		Child obj=new Child();
		obj.summary();
		obj.childSummary();
				
		
		
	}

}
