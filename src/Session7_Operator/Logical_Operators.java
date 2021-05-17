package Session7_Operator;

public class Logical_Operators {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=30;
		
		//And operator(&&)		
		System.out.println((a<b)&&(b<c));
		System.out.println((a>b)&&(b>c));
		System.out.println((a>b)&&(b<c));
		System.out.println((a<b)&&(b>c));
		
		//Or operator(||)
		System.out.println((a<b)||(b<c));
		System.out.println((a>b)||(b>c));
		System.out.println((a>b)||(b<c));
		System.out.println((a<b)||(b>c));
		
		//Not(!) Operator
		System.out.println(!(a<b)||!(b<c));  
		System.out.println(!(a>b)||!(b>c));
		System.out.println(!(a>b)||!(b<c));
		System.out.println(!(a<b)||!(b>c));
	}
}
