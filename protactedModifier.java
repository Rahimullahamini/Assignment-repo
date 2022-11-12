package pack;

// protacted Modifiers.

class A01{
	
	protected int personAcc;
	protected String personName;
	A01(int personAcc, String personName){
		this.personAcc = personAcc;
		this.personName = personName;
	}
	
	public void setter(){
		System.out.println("person id number is " + personAcc);
		System.out.println("person Accunt number is " + personName);
	}
}
public class protactedModifier {

	public static void main(String[] args) {
		
		A01 obj = new A01(10, "alikahn");
		obj.setter();
		
		
		A01 obj1 = new A01(20, "sardar");
		int personAcc1 = obj1.personAcc;
		String perconName1 = obj1.personName;
		System.out.println("person Account number is " + personAcc1 + "  person Name is " + perconName1);
	}

}
