package Session11;

public class StringMathods1 {
	
	public static void main(String[]args) {
		
		String a = "Selenium";
		String b = "SELENIUM";
		String c = "     UFT     ";
		
		// equalsignorecase(builting mathod)
		System.out.println(a.equalsIgnoreCase(b));// Ignore case but its need same name
		
		// trim(builting mathod)
		System.out.println(c.trim());// remove the space
		System.out.println(c);
		
		// substring(builting mathod)
		System.out.println(a.substring(5));
		
		// 
		System.out.println(a.contains("Sele")); // what letter it carry(contains)
	}

}
