package nitinn;

import java.util.Scanner;

public class Module_2_8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		String x;
		System.out.println("Enter an String : ");
		x=sc.next();}
		public static void count(String x) {
		int letter=0,digit=0,spaces=0,other=0;
		for(int i=0;i<=x.length();i++) {
			
		
			if(Character.isLetter(x.charAt(i))) {
				letter++;
			}
			else if(Character.isDigit(x.charAt(i))) {
				digit++;
			}
			else if(Character.isSpaceChar(i)) {
				spaces++;
			}
			else {
				other++;
			}
		}
		System.out.println("Total letter is : "+letter);
		System.out.println("Total Digit  is : "+digit);
		System.out.println("Total Spaces is : "+spaces);
		System.out.println("Others is : "+other);

	}
	
}
