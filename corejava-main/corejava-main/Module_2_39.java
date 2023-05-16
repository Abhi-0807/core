package nitinn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Module_2_39 {
	public static void main(String[] args) {
		  List<String> colors_list= new ArrayList<String>();
		  colors_list.add("Red");
		  colors_list.add("Green");
		  colors_list.add("Orange");
		  colors_list.add("White");
		  colors_list.add("Black");
		  System.out.println(colors_list);
		  
		  for (String element : colors_list) {
			    System.out.println(element);
			    }
		  
		  colors_list.add(0, "Pink");
		  colors_list.add(5, "Yellow");
		  // Print the list
		  System.out.println(colors_list);
		 
		  
		  String element = colors_list.get(0);
		  System.out.println("First element: "+element);
		  element = colors_list.get(2);
		  System.out.println("Third element: "+element);
		  
		  
		  colors_list.set(2, "Yellow");
		   // Print the list again
		  System.out.println(colors_list);
		  
		  colors_list.remove(2);
		  // Print the list again
		  System.out.println("After removing third element from the list:\n"+colors_list);
		  
		  if (colors_list.contains("Red")) {
			    System.out.println("Found the element");
			    } else {
			    System.out.println("There is no such element");
			    }
		  
		  System.out.println("List before sort: "+colors_list);
		  Collections.sort(colors_list);
		  System.out.println("List after sort: "+colors_list); 
		  
		  
		  List<String> colors_list2 = new ArrayList<String>();
		  colors_list2.add("A");
		  colors_list2.add("B");
		  colors_list2.add("C");
		  colors_list2.add("D");
		  System.out.println("List2: " + colors_list2);
		  // Copy colors_list2 to colors_list
		  Collections.copy(colors_list, colors_list2);
		  System.out.println("Copy colors_list to colors_list2,\nAfter copy:");
		  System.out.println("List1: " + colors_list);
		  System.out.println("List2: " + colors_list2);
		  
		  System.out.println("List before shuffling:\n" + colors_list);  
		  Collections.shuffle(colors_list);
		  System.out.println("List after shuffling:\n" + colors_list); 
		  
		  System.out.println("List before reversing :\n" + colors_list);  
		  Collections.reverse(colors_list);
		  System.out.println("List after reversing :\n" + colors_list); 
		  
		  System.out.println("Original list: " + colors_list);
		  List<String> sub_List = colors_list.subList(0, 3);
		  System.out.println("List of first three elements: " + sub_List);

		 }
		}


