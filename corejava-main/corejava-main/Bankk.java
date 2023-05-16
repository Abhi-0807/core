package nitinn;

import java.util.Scanner;

public class Bankk {
	public static void main(String[] args) {
		int choice;
		double amount;
		Checkingbalance c=new Checkingbalance(1,1000);
		Scanner sc=new Scanner(System.in);
		
		while(true) {//true means loop will run infinite times
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.println("Enter your Choice: ");
			choice=sc.nextInt();
		
		if(choice==1){
			System.out.println("Enter deposit Amount: ");
			amount=sc.nextDouble();
			c.deposit(amount);
		}
		else if(choice==2) {
			try {
			System.out.println("Enter withdraw amount: ");
			amount=sc.nextDouble();
			c.withdraw(amount);
		}catch(Insufficientfundd e) {
			System.out.println("you need more "+e.getamount()+"rs.");
		}
		}
		else if(choice==3) {
			c.checkbalance();
		}
		else {
			break;
		}
	}
	}
}


