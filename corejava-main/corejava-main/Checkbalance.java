package nitinn;

public class Checkbalance {
	int accno;
	double balance;
	public Checkbalance(int accno,double balance) {
		this.accno=accno;
		this.balance=balance;
	}
	
	public void deposit(double amount) {
		this.balance=this.balance+amount;
	}
	
	public void withdraw(double amount) throws kambalance{
		if(amount<=this.balance) {
			this.balance=this.balance-amount;
		}
		else {
			double needs=amount-this.balance;
			throw new kambalance(needs);
		}
	}
	
	public void checking() {
		System.out.println("your Current balance is: "+this.balance);
	}
}
