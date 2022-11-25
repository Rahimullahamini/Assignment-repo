package pack;

import java.util.Arrays;
import java.util.List;
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Java 8 program to demonstrate
		// a lambda expression
		
		
		        Runnable r = ()-> System.out.println("Running in Runnable thread");
		 
		        r.run();
		 
		        System.out.println("Running in main thread");
		    }
	}

