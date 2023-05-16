package nitinn;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		int choice;
		double amount;
		CheckingAccount c=new CheckingAccount(1,1000);
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check balance");
			System.out.println("Exit");
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			
			if(choice==1) {
				System.out.println("Enter deposit amount : ");
				amount=sc.nextDouble();
				c.deposit(amount);
			}
			else if(choice==2) {
				try {
					System.out.println("Enter Withdraw Amount: ");
					amount=sc.nextDouble();
					c.withdraw(amount);
				}catch(InsufficientFund e) {
					System.out.println("sorry you need another "+e.getamount()+"rs.");
				}
			}
			else if(choice==3) {
				c.checkBalance();
			}
			else {
				break;
			}
		}
	}

}
