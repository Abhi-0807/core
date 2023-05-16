package nitinn;

import java.util.Scanner;

public class ExceptionDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try { //code in which exception may occur
	 int a,b,c;
	 System.out.println("Start code");
	 System.out.println("Enter A: ");
	 a=sc.nextInt();
	 System.out.println("enter B: ");
	 b=sc.nextInt();
	 c=a/b;
	 System.out.println("C is: "+c);
	 int arr[]= {1,2,3,4};
	 System.out.println(arr[5]);
	}
	catch(Exception e) {
		System.out.println("exception caught");
	}
	System.out.println("end code ");
}
}
