package pack02;


class AC{
	
}
class MyTask01 extends AC implements Runnable{
	
	public void run(){
		
		for(int i = 1; i <= 10; i++){
			System.out.println(" === My Program === " + i);
		}
	}
}
public class Test {

	public static void main(String[] args) {
		
		System.out.println(" === Application Started === ");
		
		Runnable ob = new MyTask01();
		
		Thread obj = new Thread(ob);
		obj.start();
//		obj.run();
		
		
		for(int i = 1; i <= 10; i++){
			System.out.println("My Program");
		}
		System.out.println(" --- Application Finished --- ");
		
	}
}
