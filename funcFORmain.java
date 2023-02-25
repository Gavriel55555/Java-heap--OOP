import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
public class funcFORmain {
	
	// we call in this func to the class SORT
	public void sort() {  
		Scanner in=new Scanner(System.in);
		LinkedList<Integer> list1 =new LinkedList<Integer>();// for makeheap in class makeheap
		LinkedList<Integer> list2 =new LinkedList<Integer>();//for makeheap in class SORT
		SORT heap1=new SORT ();
		System.out.println("NOTE: u will be able to UNION AFTER 2 HEAPS");
	    	 System.out.println("fIRST U NEED TO CHOOSE MAKEHEAP SO WRITE IT:");
	    	 String choose1 =in.next();
	    	 if(choose1.equalsIgnoreCase("makeheap")) { //func from class sorted
				heap1.makeheap(list1,list2);
	    	 } 
	     }
	
	// we call in this func to the class unsorted   
	public void unsorted() { 
		Scanner in=new Scanner(System.in);
		LinkedList<Integer> list1 =new LinkedList<Integer>();
		LinkedList<Integer> list2 =new LinkedList<Integer>();
		unsorted  heap1=new unsorted ();
		System.out.println("NOTE: u will be able to UNION AFTER 2 HEAPS");
	    	 System.out.println("fIRST U NEED TO CHOOSE MAKEHEAP SO WRITE IT:");
	    	 String choose1 =in.next();
	    	 if(choose1.equalsIgnoreCase("makeheap")) { //func from class sorted
	    		 heap1.makeheap(list1,list2); 
	    	 }
          }
	// we call in this func to the class Foreign
	public void foreign() {
		Scanner in=new Scanner(System.in);
		LinkedList<Integer> list1 =new LinkedList<Integer>();
		LinkedList<Integer> list2 =new LinkedList<Integer>();
		Foreign  heap1=new Foreign ();
		System.out.println("NOTE: u will be able to UNION AFTER 2 HEAPS");
	    	 System.out.println("fIRST U NEED TO CHOOSE MAKEHEAP SO WRITE IT:");
	    	 String choose1 =in.next();
	    	 if(choose1.equalsIgnoreCase("makeheap")) { // func from class foreign
	    		 heap1.makeheap(list1,list2);
	    	 }
	   }
}



