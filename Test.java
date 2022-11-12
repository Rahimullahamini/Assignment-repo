package pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(14);
		list.add(11);
		list.add(7);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println(" ,,,,,,,,,,,,,,,,,,,,,,,, ");
		for(Integer obj: list){
			System.out.println(obj);
		}
		
		System.out.println(" ,,,,,,,,,,,,,,,,,,,,,,,, ");
		Iterator print = list.iterator();
		while(print.hasNext()){
			Object o = (Integer)print.next();
			System.out.println(o);
		}
		
		System.out.println(" ,,,,,,,,,,,,,,,,,,,,,,,, ");
		Iterator<Integer> data = list.iterator();
		while(data.hasNext()){
			Integer ob = data.next();
			System.out.println(ob);
		}
		
		
		
		
//		int ad = (int)'a';
//		System.out.println(ad);
//		
//		char res = (char)122;
//		System.out.println(res);
//		int z = (int)'z';
//		System.out.println(z); 
//		
//		char resulte = (char)103;
//		System.out.println(resulte);
		
	}

}
