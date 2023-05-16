package nitinn;

import java.util.Scanner;

public class Module_2_01 {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter A: ");
	a=sc.nextInt();
	System.out.println("Enter b: ");
	b=sc.nextInt();
	System.out.println("Enter c: ");
	c=sc.nextInt();
	
	if(a>b) {
		if(a>c) {
			System.out.println("your greatest number is: "+a);
		}
		else {
			System.out.println("your greatest number is: "+c);
		}
	}
	else if(b>c) {
		System.out.println("your greatest number is : "+b);
	}
	else {
		System.out.println("your greatest number is: "+c);
	}
	}

}
