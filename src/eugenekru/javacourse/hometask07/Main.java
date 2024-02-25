package eugenekru.javacourse.hometask07;

public class Main {

	public static void main(String[] args) {
		
		Pair<Integer> numbersPair = new Pair<>(333, 555);
		System.out.println(numbersPair);			
		numbersPair.demoPairClassMethods(999, 111);
				
		Pair<String> stringsPair = new Pair<>("first", "last");		
		System.out.println(stringsPair);		
		stringsPair.demoPairClassMethods("apple", "pear");		
		
		Pair<Character> charsPair = new Pair<>('A', 'B');
		Pair<Boolean> booleansPair = new Pair<>(true, false);
		
		Pair<Pair> pairPair = new Pair<>(numbersPair, stringsPair);		
		System.out.println(pairPair);		
		pairPair.demoPairClassMethods(charsPair, booleansPair);
	}

}
