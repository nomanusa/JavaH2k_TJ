package Session9;

import java.util.Scanner;

public class If_Using_Scanner {
	
	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Please enter your age");
		int i=obj.nextInt();
		
		if (i>=18)
		{
			System.out.println("The person can vote");
		}
		
		else
		{
			System.out.println("The person can not vote");
		}
	}

}
