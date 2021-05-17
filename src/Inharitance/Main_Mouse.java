package Inharitance;

public class Main_Mouse {

	//public static String color;

	public static void main(String[] args) {
		
		Mouse_1 m1=new Mouse_1();
		m1.LeftClick();
		m1.RightClick();
		m1.ScrollUp();
		m1.ScrollDown();
		m1.setcolor();
		System.out.println("\n");
		
		Mouse_2 m2=new Mouse_2();
		m2.LeftClick();
		m2.RightClick();
		m2.ScrollUp();
		m2.ScrollDown();
		m2.connect(); 
		System.out.println("\n");
		
		Mouse_3 m3=new Mouse_3();
		m3.LeftClick();
		m3.RightClick();
		m3.ScrollUp();
		m3.ScrollDown();
		m3.mouse3();
		

	}

}
