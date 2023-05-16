package nitinn;

import java.util.Scanner;

public class practice3 {
public static void main(String[] args) {
	int arr[]=new int[10];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<arr.length;i++) {
		System.out.println("enter "+i+1+"st element");
		arr[i]=sc.nextInt();	
	}
	for(int i=0;i<=arr.length;i++) {
		System.out.println("array["+i+"] element="+arr[i]);
	}
}
}
