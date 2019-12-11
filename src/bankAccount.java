
import java.util.*;

public class bankAccount {

	public static ArrayList<bankAccount> accounts = new ArrayList<bankAccount>(); 
	public Person person;
	private double balance;
	
	public static void init_accounts() {
		Person Mike = new Person("Mike",1234);
		Person Abby = new Person("Abby",2323);
		Person Dan = new Person("Dan", 5678);
		
		accounts.add(new bankAccount(Mike,2500));
		accounts.add(new bankAccount(Abby,25600));
		accounts.add(new bankAccount(Dan,500));

	}
	
	public bankAccount(Person person, double balance) {
		this.person = person;
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void deposit(double money) {
		balance += money;
		return;
		
	}
	
	public double withdraw(double mon) {
		balance = balance - mon;
		return mon;
		
	}
	
	public double checkBalance() {
		return balance;
	}
}
