package Session13;

public class Studends {
	
	String fastName;
	String lastName;
	static String collegeName="H2Kinfosys";
	// static String collegeName;
	
	public static void main(String[] args) {
		
		Studends stud1=new Studends();
		Studends stud2=new Studends();
		
		System.out.println(collegeName);
		//stud1.collegeName="H2Kinfosys";
		stud1.fastName="Noman";
		stud1.lastName="Sddiki";
		//System.out.println(stud1.collegeName);
		System.out.println(stud1.fastName);
		System.out.println(stud1.lastName);
		
		stud2.fastName="Kholifa";
		stud2.lastName="Osman";
		//System.out.println(stud2.collegeName);
		System.out.println(collegeName);
		System.out.println(stud2.fastName);
		System.out.println(stud2.lastName);
		
	}

}
