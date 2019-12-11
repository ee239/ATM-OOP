import java.util.Scanner;

public class ATMinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person mike = new Person("Mike",1234);
		bankAccount.init_accounts();
		
		bankAccount account = null;
		boolean a = false;
		int pin = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		while(!a) {
		System.out.println("Welcome! Please enter your pin");
		
		
		pin = scanner.nextInt();
		account = Person.checkPin(pin,bankAccount.accounts);
		if(account == null) {
			System.out.println("That pin is incorrect please try again");
			continue;
		}
		a = true;
		}
		
		boolean run = false;
		
		while(!run) {
		System.out.println("What would you like to do?");
		System.out.println("1 : Deposit");
		System.out.println("2 : Withdrawl");
		System.out.println("3 : Check Balance");
		System.out.println("4 : Exit");
		
		int selection = scanner.nextInt();
		switch (selection) {
		case 1: 
			//code
			System.out.println("Please enter how much money you are inserting and then insert it");
			double d = scanner.nextDouble();
			account.deposit(d);
			break;
		case 2:
			//code
			System.out.println("Please enter how much money you are withdrawing");
			double x = scanner.nextDouble();
			x = account.withdraw(x);
			System.out.println("Please take you money");
			break;
		case 3:
			System.out.println("Your balance is: " + account.checkBalance());
			break;
		case 4:
			System.out.println("Have a good day!");
			return;
			
		default :
			System.out.println("Invalid Arguement, Please Try Again");
		}
		
		//System.out.print(pin);
		
	}
	}

	
	

}
