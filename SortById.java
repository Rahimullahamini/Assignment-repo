package pack02;

import java.util.Comparator;

public class SortById implements Comparator<book>{

	@Override
	public int compare(book o1, book o2) {
		if(o1.getBid() == o2.getBid()){
			return 0;
		}else if(o1.getBid() > o2.getBid()){
			return 1;
		}else{
		return -1;
		}
	}

}
