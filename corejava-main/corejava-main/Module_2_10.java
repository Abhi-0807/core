package nitinn;

import java.util.Scanner;

public class Module_2_10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Input Number : ");
		String n=sc.nextLine();
		if(n.matches("[0-9]+")) {
			System.out.println(n+" + "+n+n+" + "+n+n+n);
		
		}else {
			System.out.println("Invalid Input");
		}
	}

}
