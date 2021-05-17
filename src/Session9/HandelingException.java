package Session9;

public class HandelingException {

	public static void main(String[] args) {
		System.out.println("Line 1");
		try
		{
		System.out.println(72/0);
		}
		catch(Exception e)
		{
			System.out.println("Hey you are trying tor devided by 0");
		}
		
		System.out.println("Line 1");

	}

}
