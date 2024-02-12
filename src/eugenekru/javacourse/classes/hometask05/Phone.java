package eugenekru.javacourse.classes.hometask05;

public class Phone {
	
	private String number;
	
	private String model;
	
	private double weight;
	
	
	public Phone(String number, String model, double weigth) {
		
		this.number = number;
		this.model = model;
		this.weight = weigth;
	}

	public String getNumber() {
		return number;
	}
	
	public void recieveCall(String name) {		
		System.out.println("\nЗвонит " + name);
	}
	
	public void recieveCall(String name, String number) {		
		System.out.println("\nЗвонит " + name + "\n" + number);
	}
	
	public void sendMessage(String...number) {
		
		System.out.println("\nThe message will be sent from number " + this.number + " to:");
		for(int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
	}

	@Override
	public String toString() {
		return "Phone number: " + number + "\nmodel: " + model + "\nweigth: " + weight + "\n";
	}
}
