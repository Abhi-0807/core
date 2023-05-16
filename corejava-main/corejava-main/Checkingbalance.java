package nitinn;

public class Checkingbalance {
	int accno;
	double balance;
	public Checkingbalance(int accno,double balance) {
		this.accno=accno;
		this.balance=balance;
	}
	
	public void deposit(double amount) {
		this.balance=this.balance+amount;
	}
	
	public void withdraw(double amount) throws Insufficientfundd{
		if(amount<=this.balance) {
			this.balance=this.balance-amount;
		}
		else {
			double needs=amount-this.balance;
			throw new Insufficientfundd(needs);
		}
		
	}
	public void checkbalance() {
		System.out.println("current balance : "+this.balance);
	}

}
