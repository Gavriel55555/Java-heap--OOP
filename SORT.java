import java.util.Collections;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Scanner;

public class SORT {
	
	Scanner in=new Scanner(System.in);
	LinkedList<Integer> list =new LinkedList<Integer>();
	 private boolean keep=true;
	 private boolean keep2=true;
	 
	 public SORT() {
			this.list=list;
			this.keep=keep; 
			this.keep2=keep2;
	}
	 public void makeheap(LinkedList<Integer> list,LinkedList<Integer> list2) {   //creating new
		 while(keep==true) {
			    System.out.println("choose-insert,extractmin,printmin,printlist,makeheap,union,or finish?");
				String choose=in.next();
				if(choose.equalsIgnoreCase("insert")) {//insert
					int x=in.nextInt();
				    list.addLast(x);	
					System.out.println(list); 	
		        }
				else if(choose.equalsIgnoreCase("printlist")) {//PTINTING THE LIST
				   		System.out.println(list);
				   	 }
				
				else if(choose.equalsIgnoreCase("printmin")) {//PTINTING THE min 
			   		System.out.println(list.getFirst());
			   		}
				
				else if(choose.equalsIgnoreCase("extractmin")) {//delete min
					System.out.println("you removed the number:"+list.getFirst());
					list.removeFirst();
					System.out.println(list);
				}
				
				else if(choose.equalsIgnoreCase("makeheap")) { // for new list
			   		System.out.println("you created a new list !!!!!!!!!! ");
					   makeheap(list2,list);
					  
			   		}
			   	
				else if(choose.equalsIgnoreCase("union")) { // call the func union
					 LinkedList<Integer> list3 =new LinkedList<Integer>();
					 union(list,list2,list3);
					 makeheap(list3,list2);
					 choose="finish";
				 }
	
		   		else if(choose.equalsIgnoreCase("finish")) {// when user want to stop
			   			keep=false;
			   		}
				}
 }

	 public void union(LinkedList<Integer> list1,LinkedList<Integer> list2,LinkedList<Integer> list3) {
		 Hashtable<Integer, Integer> hash_table =  new Hashtable<Integer, Integer>();
		 for(int i = 0;i<list1.size();i++) {//we will put the num from list 1 
			 hash_table.put(list1.get(i),list1.get(i));//we will put the num from list1 according to their value
		 }
		 for(int i = 0;i<list2.size();i++) {
			 Integer a=hash_table.get(list2.get(i));//a contains the the value of this hash table key  
			 if(a==null) {//checking if there isnt a num in this place in the table
				 hash_table.put(list2.get(i), list2.get(i));
			 }
		 }
		
		 list3= new LinkedList<>(hash_table.values());//new list to put the number that not equals in the lists
		 Collections.sort(list3); //complexity o(nlogn)
		 System.out.println(list3);
			 //same func func from the beginning just without union and makeheap
	     while(keep2==true) {
			    System.out.println("choose-insert,extractmin,printmin,printlist or finish?");
			    String choose=in.next();
				if(choose.equalsIgnoreCase("insert")) {//insert
					int x=in.nextInt();
				    list3.addLast(x);	
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


