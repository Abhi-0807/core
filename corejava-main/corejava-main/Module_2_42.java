package nitinn;

import java.util.HashMap;
import java.util.Map;

public class Module_2_42 {
	public static void main(String args[]) {  
		  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		  hash_map.put(1, "Red");
		  hash_map.put(2, "Green");
		  hash_map.put(3, "Black");
		  hash_map.put(4, "White");
		  hash_map.put(5, "Blue");
		  for(Map.Entry x:hash_map.entrySet()){  
		   System.out.println(x.getKey()+" "+x.getValue());  
		  } 
		  
		  
		  
		  System.out.println("Size of the hash map: "+hash_map.size());
		  
		  
		  
		  // check if map is empty
		  boolean result = hash_map.isEmpty();
		  // check the result
		  System.out.println("Is hash map empty: " + result);
		  // Removing all the elements from the linked map
		  hash_map.clear();
		  // check if map is empty
		  result = hash_map.isEmpty();
		  // check the result
		  System.out.println("Is hash map empty: " + result);
		  
		  
		  // checking collection view of the map
		   System.out.println("Collection view is: "+ hash_map.values());
	}
}
