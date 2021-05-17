package Session12;

public class ArrayMethods {
	
	public static void main(String[] args) {
		
		// way 1
		int a[]=new int[10];
		try
		{
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[5]=50;
		a[9]=55;
		a[10]=60; // Exception
		}
		catch(Exception e)
		{
			System.out.println("Please check your index");
		}
		
		// Way 2
		int b[]=new int[] {10, 20, 30, 40, 50};
		System.out.println(b.length);
		
		// ForLoop
		// for(initialization; condition; increment/decrement)
		
		for(int i=1; i<b.length; i++)
		{
			System.out.println(b[i]); // it's printing the value of length
			
			System.out.println(i); //it's printing the length
		}
		
		// for each loop
		for (int i:b)
		{
			System.out.println(i);
		}
		
		
		
	}

}
