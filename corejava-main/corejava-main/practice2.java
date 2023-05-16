
package nitinn;

import java.util.Scanner;

public class practice2 {
	public static void main(String[] args) {
		int i,j;
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(i=0;i<=arr.length;i++) {
			System.out.println("enter "+i+1+"array element: ");
			arr[i]=sc.nextInt();
		}
		
		for (i=0;i<=arr.length;i++) {
			System.out.println("array["+i+"element: "+arr[i]);
		}
		
}
}