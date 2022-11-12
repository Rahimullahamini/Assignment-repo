package pack;

//2 inheretance.

class A01{

	String SName;
	String SFName;
	public void Student(String SName, String SFName){
		System.out.println("student Name is " + SName);
		System.out.println("student FName is " + SFName);
	}
}

class B01 extends A01{
	
	int Sid;
	int SPhon;
	public void Student1(int Sid, int SPhon, String SName, String SFName){
		System.out.println("student1 Name is " + SName);
		System.out.println("student1 FName is " + SFName);
		System.out.println("student1 id is " + Sid);
		System.out.println("student1 Phon nubmber is " + SPhon);
		
	}

}

class C01 extends A01{
	
	int Sid;
	int SPhon;
	public void Student2(int Sid, int SPhon, String SName, String SFName){
		System.out.println("student2 Name is " + SName);
		System.out.println("student2 FName is " + SFName);
		System.out.println("student2 id is " + Sid);
		System.out.println("student2 Phon nubmber is " + SPhon);
		
	}
}
public class Test01 {

	public static void main(String[] args) {
		
		B01 obj = new B01();
		obj.Student1(10, 489398493, "khan", "sardar");
		
		new B01().Student1(10, 489398493, "khan", "sardar");
		
		C01 obj1 = new C01();
		obj1.Student2(12, 402334493, "khalid", "sardar");
		new C01().Student2(12, 402334493, "khalid", "sardar");
		

	}

}
