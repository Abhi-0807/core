package nitinn;

import java.util.Scanner;

public class Module_2_34 {
	public static void main(String arg[])
    {  
		try
		{
			// declare and initialize here.
			int a,b,c;
			Scanner sc=new Scanner(System.in);
			
			// input numbers here.
			System.out.print("Enter first number : ");
			a=sc.nextInt();
       
			System.out.print("Enter second number : ");
			b=sc.nextInt();
       
			//throw to catch
			c=a/b;
			System.out.println("Result:"+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error:"+e.getMessage());
			System.out.println("Error:"+e);
		}
		// here program ends.
		System.out.println("End of Program...");
	}
}


