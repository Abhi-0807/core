package nitinn;

import java.util.Scanner;

public class banking {
	public static void main(String[] args) {
		int choice;
		double amount;
		Checkbalance c=new Checkbalance(1,1000);
		Scanner sc=new Scanner(System.in);
		
		while(true){
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check balance");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			
			if(choice==1){
				System.out.println("Enter Deposit Amount:  ");
				amount=sc.nextDouble();
				c.deposit(amount);
			}
			else if(choice==2) {
				try {
					System.out.println("Enter withdraw Amount: ");
					amount=sc.nextDouble();
					c.withdraw(amount);
				}catch(kambalance e) {
					System.out.println("you need some more money: "+e.getamount()+"rs.");
				}
			}
			
			else if(choice==3) {
				c.checking();
			}
			else  {
				break;
			}
		}
	}

}
