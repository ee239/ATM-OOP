
public class bankAccount {
private Person person;
private double balance;

public bankAccount(Person person, double balance) {
	this.person = person;
	this.balance = balance;
}

public double getBalance() {
	return this.balance;
}
}
