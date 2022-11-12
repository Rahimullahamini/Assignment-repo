package pack;

//3 inheretance.

class A02{

	String SName;
	String SFName;
	public void Student(String SName, String SFName){
		System.out.println("student Name is " + SName);
		System.out.println("student FName is " + SFName);
	}
}

class B02 extends A02{
	
	int Sid;
	int SPhon;
	public void Student1(int Sid, int SPhon, String SName, String SFName){
		System.out.println("student1 Name is " + SName);
		System.out.println("student1 FName is " + SFName);
		System.out.println("student1 id is " + Sid);
		System.out.println("student1 Phon nubmber is " + SPhon);
		
	}

}

class C02 extends B02{
	
	int Sid;
	int SPhon;
	public void Student2(int Sid, int SPhon, String SName, String SFName){
		System.out.println("student2 Name is " + SName);
		System.out.println("student2 FName is " + SFName);
		System.out.println("student2 id is " + Sid);
		System.out.println("student2 Phon nubmber is " + SPhon);
		
	}
}

public class Test02 {

	public static void main(String[] args) {
		
		C02 obj = new C02();
		obj.Student1(10, 489398493, "khan", "sardar");
		
		new C02().Student1(10, 489398493, "khan", "sardar");
		
		obj.Student2(12, 402334493, "khalid", "sardar");
		new C02().Student2(12, 402334493, "khalid", "sardar");

	}

}
