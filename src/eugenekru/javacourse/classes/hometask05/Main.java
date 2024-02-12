package eugenekru.javacourse.classes.hometask05;

public class Main {

	public static void main(String[] args) {
		
		Phone cat = new Phone("+375297777777", "Google", 197);
		Phone dog = new Phone("+375295555555", "Apple", 228);
		Phone cow = new Phone("+375293333333", "Nokia", 98);
				
		System.out.println(cat + "\n" + dog + "\n" + cow);
				
		cat.recieveCall("Шарик");
		System.out.println(dog.getNumber());
		
		dog.recieveCall("Гаврюша");
		System.out.println(cow.getNumber());
		
		cow.recieveCall("Матроскин");
		System.out.println(cat.getNumber());
		
		cat.recieveCall("Шарик", dog.getNumber());
		dog.recieveCall("Гаврюша", cow.getNumber());
		cow.recieveCall("Матроскин", cat.getNumber());
		
		cat.sendMessage(dog.getNumber(), cow.getNumber());
		dog.sendMessage(cat.getNumber());
		cow.sendMessage(dog.getNumber(), cat.getNumber());		
	}

}
