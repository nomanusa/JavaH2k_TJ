package Session14;

public class SubChild extends Child {
	
	public void SubChildSummary()
	{
		System.out.println("I am sub child");
	}
	
	public static void main(String[] args) {
		
		SubChild obj1=new SubChild();
		obj1.summary();
		obj1.childSummary();
		obj1.SubChildSummary();
		
		
	}

}
