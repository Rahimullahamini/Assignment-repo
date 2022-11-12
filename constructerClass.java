package pack01;


class A{
	
	A(){
		System.out.println("A class zero argument constructer  ");
	}
	
	A(int a){
		System.out.println("A class one argument constructer  " + a);
	}
}
public class constructerClass {

	public static void main(String[] args) {
		
		A obj = new A();
		A obj1 = new A(60);
		
		new A();
		new A(50);
	}

}
