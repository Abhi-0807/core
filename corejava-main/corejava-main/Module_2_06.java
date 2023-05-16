package nitinn;

import java.util.Scanner;

public class Module_2_06 {
	public static void main(String[] args) {
		int n;
		int k=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k++);

			}
			System.out.println("");


		}

		
	}

}
