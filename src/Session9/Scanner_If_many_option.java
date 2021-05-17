package Session9;

import java.util.Scanner;

public class Scanner_If_many_option {

	public static void main(String[] args) {

		Scanner obj=new Scanner(System.in);
		
		System.out.println("Please Enter Your Name");
		String name=obj.nextLine();
		System.out.println("My name is "+name);
		
		System.out.println("Please Enter Your surename");
		String surename=obj.next();
		System.out.println("My name is "+surename);
		
		System.out.println("Please Enter Your age");
		String age=obj.next();
		System.out.println("My name is "+age);
		

	}

}
