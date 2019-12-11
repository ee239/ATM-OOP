import java.util.Scanner;

public class ATMinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person mike = new Person("Mike",1234);
		
		boolean a = false;
		int pin = 0;
		
		while(!a) {
		System.out.println("Welcome! Please enter your pin");
		Scanner scanner = new Scanner(System.in);
		
		pin = scanner.nextInt();
		if(!mike.checkPin(pin)) {
			System.out.println("That pin is incorrect please try again");
			continue;
		}
		a = true;
		}
		
		System.out.println("What would you like to do?");
		System.out.println("1 : Deposit");
		System.out.println("2 : Withdrawl");
		System.out.println("3 : Check Balance");
		System.out.println("4 : Exit");
		
		System.out.print(pin);
		
	}
	
	public void deposit() {
		
		
	}
	
	

}
