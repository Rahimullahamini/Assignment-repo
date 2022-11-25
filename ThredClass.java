package pack01;


//class A{
//	
//	void m1(){
//		for(int i = 1; i<=10; i++){
//			System.out.println("...my program..." + i);
//		}
//	}
//}

class B extends Thread{
	 
	public void run(){
		
		for(int i = 1; i<=10; i++){
			System.out.println("...my first program..." + i);
		}
	}
}

public class ThredClass {

	public static void main(String[] args) {
		
		System.out.println("---Application started---");
		
//		A obj = new A();
//		obj.m1();
		B obj = new B();
//		obj.run();
		obj.start();
		for(int i=1; i<=10; i++){
			System.out.println("printing i = " + i);
		}
		System.out.println("---Application finised---");
	}
}
