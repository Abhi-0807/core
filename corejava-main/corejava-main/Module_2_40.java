package nitinn;

import java.util.ArrayList;
import java.util.Collections;

public class Module_2_40 {
	 public static void main(String[] args) {
		   ArrayList<String> c1= new ArrayList<String>();
		          c1.add("Red");
		          c1.add("Green");
		          c1.add("Black");
		          c1.add("White");
		          c1.add("Pink");

		          ArrayList<String> c2= new ArrayList<String>();
		          c2.add("Red");
		          c2.add("Green");
		          c2.add("Black");
		          c2.add("Pink");

		          //Storing the comparison output in ArrayList<String>
		          ArrayList<String> c3 = new ArrayList<String>();
		          for (String e : c1)
		             c3.add(c2.contains(e) ? "Yes" : "No");
		          System.out.println(c3);
		          
		          System.out.println("Array list before Swap:");
		          for(String a: c1){
		          System.out.println(a);
		        }
		          //Swapping 1st(index 0) element with the 3rd(index 2) element
		         Collections.swap(c1, 0, 2);
		          System.out.println("Array list after swap:");
		          for(String b: c1){
		          System.out.println(b);
		     
		          }
		          
		          // Let join above two list
		          ArrayList<String> a = new ArrayList<String>();
		          a.addAll(c1);
		          a.addAll(c2);
		          System.out.println("New array: " + a);
		          
		          System.out.println("Original array list: " + c1);
		          //Increase capacity to 6
		          c1.ensureCapacity(6);
		          c1.add("White");
		          c1.add("Pink");
		          c1.add("Yellow");
		          System.out.println("New array list: " + c1);
	 }
}
