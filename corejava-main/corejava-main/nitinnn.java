package nitinn;

import java.util.Scanner;

public class nitinnn {
public static void main(String[] args) {
	
	int rno,s1,s2,s3,total;
	double percentage;
	String name;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name of student: ");
	name=sc.next();
	System.out.println("enter roll number: ");
	rno=sc.nextInt();
	System.out.println("enter physics marks: ");
	s1=sc.nextInt();
	System.out.println("enter chemistry marks: ");
	s2=sc.nextInt();
	System.out.println("enter maths marks: ");
	s3=sc.nextInt();
	total=s1+s2+s3;
	percentage=((double)total/300)*100;
	System.out.println("percentage is: "+percentage);
	
	
	
	System.out.println("name: "+name);
	System.out.println("roll no.: "+rno);
	System.out.println("total marks: "+total);
	System.out.println("percentage: "+percentage);
	System.out.println("     thank you    ");
	
	
}
}