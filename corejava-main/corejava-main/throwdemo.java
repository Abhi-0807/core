package nitinn;

import java.util.Scanner;

public class throwdemo {
public static void Demo() {
	Scanner sc=new Scanner(System.in);
	try {
	int x;
	 System.out.println("Enter X: ");
	 x=sc.nextInt();
	 if(x>0) {
		 System.out.println("square of"+ x +"is: "+x*x);
	 }
	 else {
		 throw new Exception();
	 }
	}catch(Exception e) {
		System.out.println("please enter positive number");
		Demo(); //this is called recursion
	}
	
}
public static void main(String[] args) {
	Demo();
	
}
}
