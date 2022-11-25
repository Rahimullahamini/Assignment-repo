package pack04;

class printer{
	
//	synchronized void printD(int a, String printName){
		void printD(int a, String printName){
		for(int i=1; i<=10; i++){
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(" === My program === " + printName + " " + i);
		}
	}
}

class mythread extends Thread{
	
	printer pr;
	
	mythread(printer p){
		
		pr = p;
	}
	
	public void run(){
		synchronized (pr) {
			pr.printD(100, "ali");
		}
//		pr.printD(100, "ali");
	}
}

class yourthread extends Thread{
	
	printer pr;
	
	yourthread(printer p){
		
		pr = p;
	}
	
	public void run(){
		synchronized (pr) {

			pr.printD(100, "ahmad");	
		}
//		pr.printD(100, "ahmad");
	}
}

public class MultiTreading {

	public static void main(String[] args) {
		
		System.out.println(" --- Application Started --- ");
		
		printer obj = new printer();
//		obj.printD(10, "Book");
		
		mythread obj01 = new mythread(obj);
		yourthread obj02 = new yourthread(obj);
		
		obj01.start();
//		try {
//			obj01.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		obj02.start();
//		try {
//			obj02.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		int a = 10/0;
//		System.out.println(a);
		
		System.out.println(" ,,, Application Finshid ,,, ");
	}
}
