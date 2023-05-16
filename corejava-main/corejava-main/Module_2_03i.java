package nitinn;

import java.util.Scanner;

public class Module_2_03i {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an year: ");
		n=sc.nextInt();
		if(n%4==0) {
			System.out.println("Entered year is a LEAP year");
		}
		else {
			System.out.println("Entered year is not a LEAP year");
		}
	}
	

}
