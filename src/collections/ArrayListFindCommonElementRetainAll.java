package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListFindCommonElementRetainAll {

	public static void main(String[] args) {
		 ArrayList<String> al=new ArrayList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ajay"); 
		  
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("Rav");  
		  al2.add("Ajay"); 
		  
		  ArrayList<String> al3=new ArrayList<String>();  
		  al3.add("Ravi");  
		  al3.add("Ajay");
		  
		  al.retainAll(al2);
		  al.retainAll(al3); 
		  System.out.println("iterating the elements after retaining the elements of al2");  
		  Iterator itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}

}
