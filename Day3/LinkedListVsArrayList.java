package LinkedList;

import java.util.*;

public class LinkedListVsArrayList {

	public static void main(String[] args) {
	 
		  List<String> list = new ArrayList<>();
	      long start1 = System.nanoTime();
	      list.add("A");
	      list.add("B");
	      list.add("C");
	      list.add("D");
	      long end1 = System.nanoTime();
	      long aLTime = end1-start1;
	      System.out.println("Adding 4 elements to ArrayList, Elapsed Time in nano seconds: "+ aLTime);
	      
	      List<String> list1 = new LinkedList<>();
	      long start2 = System.nanoTime();
	      list1.add("A");
	      list1.add("B");
	      list1.add("C");
	      list1.add("D");
	      long end2 = System.nanoTime();
	      long lLTime = end2-start2;
	      System.out.println("Adding 4 elements to LinkedList, Elapsed Time in nano seconds: "+ lLTime);
	      
	      if (aLTime > lLTime) {
	        System.out.println("ArrayList taking more nano seconds than LinkedList");
	        System.out.println("arraylist is slower and Linked List is faster");
	      }
	      else {
	        System.out.println("LinkedList is taking more seconds than ArrayList");
	        System.out.println("Arraylist List is faster and linked list is slower");
	      }
	      
	      start1 = System.nanoTime();
	      System.out.println(list);
	      end1 = System.nanoTime();  
	      aLTime = end1-start1;
	      System.out.println("Printing 4 elements in the ArrayList, Elapsed Time in nano seconds: "+ aLTime);
	      
	      start2 = System.nanoTime();
	      System.out.println(list1);
	      end2 = System.nanoTime();
	      lLTime = end2-start2;
	      System.out.println("Printing 4 elements to LinkedList, Elapsed Time in nano seconds: "+ lLTime);
	         
	      if (aLTime > lLTime)
	        System.out.println("ArrayList taking more nano seconds than LinkedList");
	      else
	        System.out.println("LinkedList is taking more seconds than ArrayList");
	     
	      start1 = System.nanoTime();
	      list.add(1,"E");
	      end1 = System.nanoTime(); 
	      aLTime = end1-start1;
	      System.out.println("adding a element in the ArrayList at the index 1, Elapsed Time in nano seconds: "+ aLTime);
	      
	      start2 = System.nanoTime();
	     list1.add(1, "E");
	      end2 = System.nanoTime();
	      lLTime = end2-start2;
	      System.out.println("adding a element in the LinkedList at the index 1, Elapsed Time in nano seconds: "+ lLTime);
	   
	             
	      if (aLTime > lLTime)
	        System.out.println("ArrayList taking more nano seconds than LinkedList");
	      else
	        System.out.println("LinkedList is taking more seconds than ArrayList");
	      
	      
	      start1 = System.nanoTime();
	      System.out.println(list.remove(1));
	      end1 = System.nanoTime(); 
	      aLTime = end1-start1;
	      System.out.println("Removing a element in the ArrayList, Elapsed Time in nano seconds: "+ aLTime);
	      
	      start2 = System.nanoTime();
	      System.out.println(list1.remove(1));
	      end2 = System.nanoTime();
	      lLTime = end2-start2;
	      System.out.println("Removing a element in the LinkedList, Elapsed Time in nano seconds: "+ lLTime);

	      if (aLTime > lLTime)
	          System.out.println("ArrayList taking more nano seconds than LinkedList");
	        else
	          System.out.println("LinkedList is taking more seconds than ArrayList");
	}

}
