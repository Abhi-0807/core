package nitinn;

import java.util.Scanner;

public class Module_2_02 {
	public static void main(String[] args) {
		char c;
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Character: ");
		c=sc.next().charAt(0);
		switch(c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'I':
		case 'O':
		case 'U': i++;
			
		}
	
		if(i==1) {
			System.out.println("Entered Character is "+c+" is vowel");
		}
		else if(c>='a'&&c<='z'||c>='A'&&c<='Z') {
			System.out.println("Entered Character is "+c+" is consonent");
		}
		else {
			System.out.println("you entered wrong input");
		}
		
		
	}

}

	
