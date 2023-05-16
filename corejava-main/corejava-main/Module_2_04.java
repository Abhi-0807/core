package nitinn;

import java.util.Scanner;

public class Module_2_04 {
	public static void main(String[] args) {
		int n[]=new int[5];
		int k=0;
		Scanner sc=new Scanner(System.in);
	
		for(int i=1;i<=n.length;i++) {
			System.out.println("Enter Element no  "+i+" : ");
			k+=sc.nextInt();
			//k=k+n[i];

		}
		System.out.println("Sum is :"+k);
		System.out.println("Average of 5 numbers is : "+(k/5));
		//System.out.println("sum is: "+k);
/*		for(int i=0;i<=n.length;i++) {
*/					}
		
	
}

