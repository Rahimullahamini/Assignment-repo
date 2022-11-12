package FirstPack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.util.Scanner;

public class trywithresource {

	public static void main(String[] args) throws IOException{
//		
//		String path = "F:\\programing.text";
//		BufferedReader br = null;
//		String data = "";
//		
//		try without resources
//		try {
//			 br = new BufferedReader(new FileReader(path));
//			data = br.readLine();
//			System.out.println(data);
//			
//		} 
////		catch(IOException e){
////			System.out.println(e);
////		}
//		finally{
//			
//			br.close();
//			
////			try{
////				br.close();
////			}catch(IOException e){
////				System.out.println(e);
////			}
//		
//		}
		
//		*****************************************************************************************************
		
//		try with resoursce
		
		String path1 = "F:\\Ahamd.text";
//		BufferedReader br1 = null;
//		String data1 = "";
		
		
//		try(BufferedReader br1  = new BufferedReader(new FileReader(path1))){
//			String data1 = br1.readLine();
//			System.out.println(data1);
//		}
//		catch (Exception e) {
//			System.out.println(e);
//		}
		
		
//		*************************************************************************************
		
//		3case
		
		String path = "F:\\Ahamd.text";
		
		try(Scanner scan = new Scanner(System.in);
				BufferedReader br = new BufferedReader(new FileReader(path))){
			
			System.out.println("enter your x");
			int x;
			x = scan.nextInt();
			System.out.println("your x number is = " + x);
			
			String data = br.readLine();
			System.out.println(data);
			
			
			
			
		}
		
		
		
		
		
		
	}

}
