package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayyList {

	public static void main(String[] args) {

		ArrayList<String> list = (ArrayList<String>) Arrays.asList("a","b","c","d","e");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			if(itr.next().equals("c")) {
				list.remove("c");
		
				// Interview Question of LTIMindtree
				
				//samit kumar das give me  ranajay datta's number  9903063051
				
				//ConcurrentModificationException
				
				//Fail fast and fail safe iterators
			
			}
			
		}
		
	}

}
