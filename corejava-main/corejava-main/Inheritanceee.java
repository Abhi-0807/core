package nitinn;

import java.util.Scanner;

class A{
	int a;
	void geta() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a: ");
		a=sc.nextInt();
	}
	void puta() {
		System.out.println("a: "+a);
	}
}
class B extends A{
	int b;
	void getb() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter b: ");
		b=sc.nextInt();
	}
	void putb() {
		System.out.println("b is: "+b);
	}
}

public class Inheritanceee {
	public static void main(String[] args) {
		B b1=new B();
		b1.geta();
		b1.puta();
		b1.getb();
		b1.putb();
		
	}

}
