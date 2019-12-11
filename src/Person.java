
public class Person {
	private String name;
	private int pin;
	

public Person(String name, int pin) {
	this.name = name;
	this.pin = pin;
}

public boolean checkPin(int putin){
	if(putin == pin) {
		return true;
	}else {
	
	return false;
	}
}

public int getPin() {
	return pin;
}
}
