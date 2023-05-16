package nitinn;

import java.util.Scanner;

public class Module_2_37 {
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
		catch(Exception e)
		{
			e.printStackTrace();

		}
		// here program ends.
		System.out.println("End of Program...");
	}
}


