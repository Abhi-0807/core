package nitinn;

import java.util.Scanner;

public class Module_2_07 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    int n;
		    System.out.print("Input an integer Number Less Than Ten Billion : ");
		    n = sc.nextInt();
		    int counter = 0;
		    while(n > 0){
		        n = n / 10;
		        counter++;
		    }
		    System.out.println("Number of Digits in the number"+counter);
		}
	}


