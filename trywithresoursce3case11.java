package FirstPack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class trywithresoursce3case11 {
	
	static void main(String args[]) throws IOException{
		
		String path = "F:\\Ahamd.text";
		
		try(Scanner scan = new Scanner(System.in);
				/*BufferedReader br = new BufferedReader(new FileReader(path))*/){
			
			System.out.println("enter your x");
			int x;
			x = scan.nextInt();
			System.out.println(x);
			
//			String data = br.readLine();
//			System.out.println(data);
			
			
			
			
		}
	
		
	}
}
