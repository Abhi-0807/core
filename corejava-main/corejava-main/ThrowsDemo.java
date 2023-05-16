package nitinn;

import java.util.Scanner;

public class ThrowsDemo {
	public static void demo() throws Exception{
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter X: ");
		x=sc.nextInt();
		if(x>0) {
			System.out.println("square of "+ x +"is: "+x*x );
		}
		else {
			 throw new Exception();
		}
		
		
	}
	public static void main(String[] args) {
		
		try {
			demo();
		}
		catch(Exception e) {
			System.out.println("exception caught");
			
		}
	}

}
