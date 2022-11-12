package FirstPack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class fileclass {

	public static void main(String[] args) throws IOException {
		
		
		Scanner user = new Scanner(System.in);
		System.out.println("Plase Write...");
		String data = user.nextLine();
		try {
			FileOutputStream fout = new FileOutputStream(new File("F:\\programing.text"));
			PrintWriter o = new PrintWriter(fout);
			o.write(data );
			o.close();
		} catch (FileNotFoundException e1) {
			System.out.println("Exception...");
		}
		
		
		
		try {
			FileInputStream fin = new FileInputStream("F:\\programing.text");
			int res = 0;
			while((res = fin.read()) !=-1){
				System.out.print((char)res);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		
		
//		FileoutputStream
//		Scanner user = new Scanner(System.in);
//		System.out.println("Plase Write...");
//		String data = user.nextLine();
//		try {
//			FileOutputStream fout = new FileOutputStream(new File("F:\\programing.text"));
//			PrintWriter o = new PrintWriter(fout);
//			o.write(data );
//			o.close();
//		} catch (FileNotFoundException e1) {
//			System.out.println("Exception...");
//		}
//				
//		try {
//			Scanner scan = new Scanner(new File("F:\\programing.text"));
//			
//			while(scan.hasNext()){
//				System.out.println(scan.nextLine());
//			}
//		} catch (Exception e) {
//			System.out.println("Exception Handle..." + e);
//		}
		
	}

}
