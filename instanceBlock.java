package pack01;


class B{
	
	B(int a){
		System.out.println("one argument constructer in the B class " + a);
	}
}

class C extends B{
	
	
//	constructer.
	
	C(){
		this("Faiz Ahamd Faiz");
		
		System.out.println("C class one argument constructer  ");
	}
	C(String name){
		super(120);
		System.out.println("C class one argument constructer  " + name);
	}
	
//	instance block.
	{
		System.out.println("instance block in the C class ");
	}
	
//	static bloc.
	static{
		System.out.println("static block in the C class ");
	}
}

public class instanceBlock {

	public static void main(String[] args) {
		
		
		C obj = new C();
		new C();
		
	}
}
