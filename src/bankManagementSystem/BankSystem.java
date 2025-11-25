package bankManagementSystem;

import java.util.Scanner;

public class BankSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IO.println("Enter your account name");
		String name = sc.nextLine();
		
		IO.println("Enter your account Number");
		String number = sc.nextLine();
		
		IO.println("Enter your account balance");
		double bal = sc.nextDouble();
		
		BankAccount account = new BankAccount(name,number,bal);
		
		while(true) {
			IO.println("Bank Menu ");
			IO.println("1. deposite ");
			IO.println("2. withdraw ");
			IO.println("3. check balance ");
			IO.println("4. Exit ");
			IO.println("Choose Options ");
			
			int inputuser = sc.nextInt();
			
			switch(inputuser) {
			case 1 : 
				IO.println("Enter amount to be deposited: ");
				account.deposite(sc.nextDouble());
				break;
				
			case 2 :
				IO.println("Enter amount to be withdrawn");
				account.withdraw(sc.nextDouble());
				break;
			case 3 : 
				IO.println("Check your balance: ");
				account.totalBalance();
				break;
			case 4 : 
				System.out.println("Thankyou for exiting-----------");
				account.exit();
				break;
			default : 
				IO.println("Invalid Options");
			}
		
		}
		

	}

}
