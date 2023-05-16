package nitinn;

import java.util.Scanner;

public class forloop {
public static void main(String[] args) {
	int n,sum=0;
	System.out.println("enter n: ");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	
	for(int i=n;i>=1;i--) {
		sum=sum+i;
		
	}
	System.out.print(sum);
	
}
}