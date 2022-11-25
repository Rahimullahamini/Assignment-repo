package pack03;


class yourTask implements Runnable{
	
	public void run(){
		
		for(int i=1; i<10; i++){
			
			System.out.println(" --- MY PROGRAM --- " + i);
		}
	}
}


public class Test {

	public static void main(String[] args) {
		
		yourTask obj = new yourTask();
		obj.run();
		
		
//		Thread yourTask = new Thread(new yourTask());
//		yourTask.start();
		
		Thread a = new Thread(new yourTask());
		a.start();
		
		for(int i=1; i<=10; i++){
			System.out.println(" -- program is -- " + i);
		}
	}
}
