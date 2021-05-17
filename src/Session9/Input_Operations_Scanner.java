package Session9;

import java.util.Scanner;

public class Input_Operations_Scanner {
	
	public static void main(String[]args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Please Enter Your Name");
		String name=obj.next();
		System.out.println("Your Name is "+name);
	}

}
