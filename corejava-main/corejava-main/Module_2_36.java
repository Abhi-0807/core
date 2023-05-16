package nitinn;

public class Module_2_36 {
	public static void main(String args[]){   
		  try{    
		  //inner try block 1  
		    try{    
		     System.out.println("going to divide by 0");    
		     int b =39/0;    
		   }  
		    //catch block of inner try block 1  
		    catch(ArithmeticException e)  
		    {  
		      System.out.println("Error : "+e);  
		    }    
		       
			   
		  }  
		  //catch block of outer try block  
		  catch(Exception e)  
		  {  
		    System.out.println("handled the exception (outer catch)");  
		  }    
		    
		  System.out.println("Code Continues ..");    
		 }    
		}  



