package pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class SortingException {

	public static void main(String[] args) {
		
		
//		ArrayList list = new ArrayList();
//		list.add("sardar");
//		list.add("ali");
////		list.add(8430);
//		list.add("ahmad");
//		list.add("paridahmad");
//		
//		
//		Collections.sort(list);
//		for(Object obj: list){	
//			System.out.println(obj);	
//		}
		
		
		
		LinkedList<String> list = new LinkedList<String>();
		Scanner scann = new Scanner(System.in);
		
		while(true){
			System.out.println("Enter you are a name ");
			String n;
			n = scann.next();
			list.add(n);
			if(n.toLowerCase().equals("stop")){
				break;
			}
		}
		
		for(Object obj: list){
			System.out.println(obj);
		}
		System.out.println("befor sort linkedlist ");
		Collections.sort(list);
		System.out.println("after sort linkedlist ");
		for(Object obj: list){
			System.out.println(obj);
		}
//		try {
//			list.add(480);
//			System.out.println(list);
//		} catch (Exception e) {
//			
//		}
		
	}
}
