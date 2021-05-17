package Session15;

public class MethodOverloading {
	
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	
	public void add(double a, double b)
	{
		System.out.println(a+b);
	}
	
	public void add(int d, int e, int f, int g)
	{
		System.out.println(d+e+f+g);
	}

	public static void main(String[] args) {

		MethodOverloading obj=new MethodOverloading();
		obj.add(3, 20);
		obj.add(6, 5, 8);
		obj.add(2.5, 3.6);

	}

}
