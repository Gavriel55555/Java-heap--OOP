//name:gavriel michaeli

import java.util.Scanner;

//her we are choosing (sort,unsorted,foreign) and we are calling the right class from funcFORmain
public class main3 {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("choose:sorted,unsorted,foreign");
	     String choose =in.next();
	     if(choose.equalsIgnoreCase("sorted")) { //if the user choosing sorted 
	    	 funcFORmain funcs=new funcFORmain();
	    	 funcs.sort();
	     }
	     else if(choose.equalsIgnoreCase("unsorted")) { //if the user choose unsorted
	    	 funcFORmain funcs2=new funcFORmain();
	    	 funcs2.unsorted();
	     }
	     else if(choose.equalsIgnoreCase("foreign")){  //if the user choose foreign
	    	 funcFORmain funcs2=new funcFORmain();
	    	 funcs2.foreign();
	     }
	     }
	}

