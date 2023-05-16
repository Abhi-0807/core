package nitinn;

import java.util.Scanner;

public class staticvariabledemo {
	static int a;
	Scanner sc=new Scanner(System.in);
	void setvalue() {
		System.out.println("Enter a: ");
		a=sc.nextInt();
	}
	void getvalue() {
		System.out.println("A: "+a);
	}
public static void main(String[] args) {
	staticvariabledemo s1=new staticvariabledemo();
	staticvariabledemo s2=new staticvariabledemo();
	staticvariabledemo s3=new staticvariabledemo();
	
	s1.setvalue();
	s2.setvalue();
	s3.setvalue();
	
	s1.getvalue();
	s2.getvalue();
	s3.getvalue();
}
}
