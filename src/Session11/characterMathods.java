package Session11;

public class characterMathods {

	public static void main(String[] args) {
		
		char a = 'A';
		char b = '1';
		
		//isLetter
		System.out.println(Character.isLetter(a));
		System.out.println(Character.isLetter(b));
		System.out.println(Character.isLetter('n'));
		System.out.println(Character.isLetter('1'));
		System.out.println(Character.isLetter('*'));
		
		// isAlphabetic
		System.out.println();
		System.out.println(Character.isAlphabetic(a));
		System.out.println(Character.isAlphabetic(b));
		System.out.println(Character.isAlphabetic('a'));
		System.out.println(Character.isAlphabetic('1'));
		System.out.println(Character.isAlphabetic('*'));
		
		// isDegit
		System.out.println();
		System.out.println(Character.isDigit(a));
		System.out.println(Character.isDigit(b));
		System.out.println(Character.isDigit('a'));
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.isDigit('*'));
		

	}

}
