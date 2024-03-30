package eugenekru.javacourse.hometask07;

public class Main {

	public static void main(String[] args) {
		
		Pair<Integer, String> numberString1 = new Pair<>(999, "first");		
		demoPairClassMethods(numberString1, 111, "last");
		
		Pair<Boolean, Character> booleanCharacter1 = new Pair<>(true, 'A');
		demoPairClassMethods(booleanCharacter1, false, 'Z');
		
		
		Pair<Integer, String> numberString2 = new Pair<>(777, "good");		
		Pair<Boolean, Character> booleanCharacter2 = new Pair<>(false, '!');
		
		Pair<Pair<Integer, String>,
			 Pair<Boolean, Character>> twoPairs = new Pair<>(numberString1,
					 										 booleanCharacter1);		
		demoPairClassMethods(twoPairs, numberString2, booleanCharacter2);

	}
	
	public static <T1, T2> void demoPairClassMethods(Pair<T1, T2> pair,
													 T1 newFirstElement,
													 T2 newLastElement)
	{	
		Pair<T1, T2> pairDemo = new Pair<>(pair.first(), pair.last());
		
		System.out.println("First element of Pair is "
		+ pairDemo.first().getClass().getSimpleName()
		+ ": " + pairDemo.first() + "\n");
		
		System.out.println("LastElement of Pair is "
		+ pairDemo.last().getClass().getSimpleName()
		+ ": " + pairDemo.last() + "\n");		
		
		pairDemo.replaceFirstElement(newFirstElement);
		System.out.println("Pair after replace first element\n" + pairDemo);
		
		pairDemo.replaceLastElement(newLastElement);
		System.out.println("Pair after replace last element\n" + pairDemo);		
		
		System.out.println("Pair after swap\n" + pairDemo.swap());
		}	

}
