package pack02;

import java.util.Comparator;

public class SortByName implements Comparator<book>{

	@Override
	public int compare(book obj1, book obj2) {
		
		return obj1.getBname().compareTo(obj2.getBname());
	}
	

}
