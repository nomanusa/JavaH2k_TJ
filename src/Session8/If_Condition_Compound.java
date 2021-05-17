package Session8;

import java.util.Scanner;

public class If_Condition_Compound {
	
	public static void main(String[] args) {
		
		int age = 20; 
//		String country = "Canada";
		String country = "";
//		int age = 0;
		
		
//		Scanner obj = new Scanner(System.in);
//		System.out.println("Please Enter Your Age : ");
//		int age = obj.nextInt();
//		System.out.println("My Age is : " + age);
		
		Scanner obj1 = new Scanner(System.in);
		System.out.print("Please Enter Your country :" );
		country = obj1.nextLine();
		System.out.println("My Country is : " + country);
		
		//obj1.close();
				
		
		if(age>18 || age == 18) //Compound Statement
		{
			System.out.println("The person can be pertially elegible to Vote");
			
			if(country == "Bangladesh")
			{
				System.out.println("The person fully elegible to Vote");
			} else {
				System.out.println("The person is not citizen of US");
			}
			
		}
		
		else 
		{
			System.out.println("The person can't elegible to Vote");
		}
		
	}

}
