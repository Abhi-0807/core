package nitinn;

public class Checkbalancee {
	int accno;
	double balance;
	public Checkbalancee(int accno,double balance) {
		this.accno=accno;
		this.balance=balance;
	}
	
	public void deposit(double amount) {
		this.balance=this.balance+amount;
	}
	
	public void withdraw(double amount) throws Lowbalance{
		if(amount<=this.balance) {
			this.balance=this.balance-amount;
		}
		else {
			double needs=amount-this.balance;
			throw new Lowbalance(needs);
		}
	}
	public void Checking() {
		System.out.println("your current balance is "+this.balance);
	}

}
