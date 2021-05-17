package Session11;

public class StringMathods2 {
	
	public static void main(String[] args) {
		
		String a = "Welcome to selenium testing";
		// substring(built in method)
		System.out.println(a.substring(8));
		System.out.println(a.substring(11));
		System.out.println(a.substring(11, 20));
		System.out.println(a.substring(8, 10));
		
		// startsWith(built in method)
		System.out.println();
		System.out.println(a.startsWith("Welcome to"));
		System.out.println(a.startsWith("Welcome"));
		System.out.println(a.startsWith("to"));
		System.out.println(a.startsWith("Welcome to selenium testing a"));
		System.out.println();
		
		// endwith(built in method)
		System.out.println(a.endsWith("testing"));
		System.out.println(a.endsWith("selenium testing"));
		System.out.println(a.endsWith("selenium"));
		
		
	}

}
