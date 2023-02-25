import java.util.Collections;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Scanner;

public class Foreign {
	Scanner in=new Scanner(System.in);
	LinkedList<Integer> list =new LinkedList<Integer>();
	LinkedList<Integer> list2 =new LinkedList<Integer>();
	 private boolean keep2=true;
	 private boolean keep=true;
	 Hashtable<Integer, Integer> hash_table =  new Hashtable<Integer, Integer>();//new hashtable

	 public Foreign() {
			this.list=list;
			this.keep=keep; 
			this.keep2=keep2;
  }
	 public void makeheap(LinkedList<Integer> list,LinkedList<Integer> list2) {     //creating new 
		 while(keep==true) {
			    System.out.println("choose-insert,extractmin,printmin,printlist,makeheap,union,or finish?");
				String choose=in.next();
				if(choose.equalsIgnoreCase("insert")) {//insert
					int x=in.nextInt();
					if(hash_table.get(x)==null) {//checks if then user all ready insert this number
						    hash_table.put(x,x);
						    list.addLast(x);
							Collections.sort(list);//sort the list time o(nlogn)
							
							System.out.println(list); 
					 }
					 else {
						 System.out.println("you insert this num allready in list1" );
						 System.out.println(list); 
					 }
		        }
				else if(choose.equalsIgnoreCase("printlist")) {//PTINTING THE LIST
				   		System.out.println(list);
				   	 }
				
				else if(choose.equalsIgnoreCase("printmin")) {//PTINTING THE min 
			   		System.out.println(list.getFirst());
			   		}
				
				else if(choose.equalsIgnoreCase("extractmin")) {//delete min
					hash_table.remove(list.getFirst());
					System.out.println("you removed the number:"+list.getFirst());
					list.removeFirst();
					System.out.println(list);
				}
				
				else if(choose.equalsIgnoreCase("makeheap")) {  // creating new list
			   		System.out.println("you created a new list !!!!!!!!!! ");
					   makeheap(list2,list);
					  
			   		}
			   	
				else if(choose.equalsIgnoreCase("union")) { // call the func union
					 LinkedList<Integer> list3 =new LinkedList<Integer>();
					 union(list,list2,list3);
					 makeheap(list3,list2);
					 choose="finish";
				 }
	
		   		else if(choose.equalsIgnoreCase("finish")) { // when user want to stop
			   			keep=false;
			   		}
				}
         }
     
	
	 public void union(LinkedList<Integer> list1,LinkedList<Integer> list2,LinkedList<Integer> list3) {
		 for(int i=0;i<list1.size();i++) {
	    	 list3.addLast(list1.get(i)); //
	     }
	     for(int i=0;i<list2.size();i++) {
	    	 list3.addLast(list2.get(i));
	     }
		 Collections.sort(list3);
		 System.out.println(list3); // we union list 1 and list 2 to list 3
		    //func from the beginning just without union or makeheap
		while(keep2==true) {
			    System.out.println("choose-insert,extractmin,printmin,printlist or finish?");
				String choose=in.next();
				if(choose.equalsIgnoreCase("insert")) {//insert
					int x=in.nextInt();
				    list3.addLast(x);
				    Collections.sort(list3);//sort the list time o(nlogn)
					System.out.println(list3); 	
					}
				else if(choose.equalsIgnoreCase("printlist")) {//PTINTING THE LIST
			   		System.out.println(list3);
					   	 }
					
				else if(choose.equalsIgnoreCase("printmin")) {//PTINTING THE min 
			   		System.out.println(list3.getFirst());
				   		}
					
				else if(choose.equalsIgnoreCase("extractmin")) {//delete min
					hash_table.remove(list3.getFirst());
					System.out.println("you removed the number:"+list3.getFirst());
					list3.removeFirst();
					System.out.println(list3);
					}
				else if(choose.equalsIgnoreCase("finish")) {
		   			keep2=false;
		   			keep=false;
	     	   		}
		         }
		     
		 }		 
	 }
	 
