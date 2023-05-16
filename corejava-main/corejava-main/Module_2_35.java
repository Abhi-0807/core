package nitinn;

public class Module_2_35 {
	public static void main(String[] args) {  
        
        try{    
             int a[]=new int[5];    
             a[5]=30/0;    
            }    
            catch(ArithmeticException e)  
               {  
                System.out.println("ERROR : Arithmetic Exception occurs");  
               }    
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ERROR : ArrayIndexOutOfBounds Exception occurs");  
               } 
        System.out.println("End of the code");    

	}
}
