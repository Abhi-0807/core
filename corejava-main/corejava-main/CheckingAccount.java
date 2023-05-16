package nitinn;

public class CheckingAccount {
	int acno;
	double balance;
	public CheckingAccount(int acno,double balance) {
		this.acno=acno;
		this.balance=balance;
	}
	public void deposit(double amount) {
		this.balance=this.balance+amount;
	}
	public void withdraw(double amount) throws InsufficientFund{
		if(amount<=this.balance) {
			this.balance=this.balance-amount;
		}
		else {
			double needs=amount-this.balance;
			throw new InsufficientFund(needs);
			}
		}
	public void checkBalance() {
		System.out.println("Current Balance: "+this.balance);
	}

}
