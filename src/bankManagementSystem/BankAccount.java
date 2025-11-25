package bankManagementSystem;

public class BankAccount {
	String name;
	String accountNumber;
	Double balance;
	
	public BankAccount(String name, String accountNumber, Double balance) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void deposite(double amount) {
		balance += amount;
		IO.println("depsited amount: " + balance);
		
	}
     public void withdraw(double amount) {
    	 if(amount > balance) {
    		 IO.println("Amount is not sufficient");
    	 }
    	 balance -= amount;
    	IO.println("balancce is updated with new amount " + balance); 
     }
	public void totalBalance() {
		IO.println("Current balance: " + balance);
	}

	public void exit() {
		IO.println("You have logged out from your bank ");
		
	}

}
