
import java.util.*;

public class Person {
	private String name;
	private int pin;
	

public Person(String name, int pin) {
	this.name = name;
	this.pin = pin;
}

public static bankAccount checkPin(int putin, ArrayList<bankAccount> accounts ){
	
	for(int i = 0; i < accounts.size(); i++) {
	
	if(putin == accounts.get(i).person.pin) {
		return accounts.get(i);
	}
	
	}
	return null;
}

public int getPin() {
	return pin;
}
}
