package nitinn;

public class Module_2_28 {
	  public static void main(String[] args) {

	        

	        BankA bA = new BankA();

	        bA.getBalance();

	        

	        BankB bB = new BankB();

	        bB.getBalance();

	        

	        BankC bC = new BankC();

	        bC.getBalance();

	        



	    }

	    

	}



	abstract class Banking{



	   public abstract void getBalance();

	}



	class BankA extends Banking{

	    


		
	    public void getBalance(){

	        System.out.println("Deposited: $100 ");

	    }

	}



	class BankB extends Banking{




	    public void getBalance(){

	        System.out.println("Deposited: $150 ");

	    }

	}



	class BankC extends Banking{




	    public void getBalance(){

	        System.out.println("Deposited: $200 ");

	    }
	}

	
