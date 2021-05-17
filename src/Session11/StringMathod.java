package Session11;

public class StringMathod {
	
	public static void main(String[] args) {
		
		String a = "hello";
		String b = "HELLO";
		String c = "Hello";
		String d = "hello";
		
		
		// compareTo(builting mathod)
		System.out.println("Compare to : " + a.compareTo(b)); // (97-65)
		System.out.println("Compare to : " + b.compareTo(a)); // (65-97)
		System.out.println("Compare to : " + a.compareTo(c));
		System.out.println("Compare to : " + a.compareTo(d));
		
		// equals(builting mathod)
		System.out.println("Equals : " + a.equals(d));
		
		// + or concat(builting mathod) same work
		System.out.println("Add : " + a+b);
		System.out.println("Concat : " + a.concat(b));
		
		//charAt(builting mathod)
		System.out.println(c.charAt(0)); //I didn't understand this one
		System.out.println(c.charAt(1)); // Now i got it 
		System.out.println(c.charAt(2));
		System.out.println(c.charAt(3));
		System.out.println(c.charAt(4));
		
		// equalsIgnoreCase(builting mathod)
		System.out.println(a.equalsIgnoreCase(b));
		
		// toUpperCase(builting mathod)
		System.out.println(a.toUpperCase());
		System.out.println(b.toUpperCase());
		System.out.println(c.toUpperCase());
		System.out.println(d.toUpperCase());
		
		// toLowerCase(builting mathod)
		System.out.println(a.toLowerCase());
		System.out.println(b.toLowerCase());
		System.out.println(c.toLowerCase());
		System.out.println(d.toLowerCase());
		
		// length(builting mathod)
		System.out.println(d.length());
		
		
		
		
		
		
	}

}
