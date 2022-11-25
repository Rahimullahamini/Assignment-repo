package pack;

public class Test {

	public static void main(String[] args) {
		
		
		        Runnable r = new Runnable() {
		            public void run()
		            {
		            	for(int i = 1; i <= 10; i++){
		            		  System.out.println("Running in Runnable thread");
		            	}
		            }
		        };
		 
		        r.run();
		        for(int i = 1; i <= 10; i++){
		        	  System.out.println("Running in main thread");
          	}    
	}

}
