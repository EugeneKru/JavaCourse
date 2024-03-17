package eugenekru.javacourse.hometask10;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {		
		
		List<String> myList = Arrays.asList("a1", "a2","a3","b1","b3","c2","c1","c5");
		
		System.out.println("Original ArrayList:\n" + myList + "\n");
		
		getVariantWithAdditionalSorting(myList);
		
		getVariantWithAdditionalStream(myList);
		
	}
	
	public static void getVariantWithAdditionalSorting(List<String> myList) {
		
		System.out.println("Elements of myList after stream"
				+ " with getVariantWithAdditionalSorting:");
		
		long variant1 = myList.stream()
				.filter(element -> element.matches("\\w[^3]"))				
				.sorted((element1, element2) -> Integer.valueOf(element1.substring(1))
						.compareTo(Integer.valueOf(element2.substring(1))))				
				.sorted((element1, element2) -> element2.compareTo(element1))				
				.skip(1)
				.sorted()
				.skip(1)
				.sorted((element1, element2) -> element2.compareTo(element1))
				.map(String::toUpperCase)				
				.peek(System.out::println)
				.count();
		
		System.out.println("Number of remaining elements: " + variant1 + "\n");		
	}
	
	public static void getVariantWithAdditionalStream(List<String> myList) {
		
		System.out.println("Elements of myList after stream"
				+ " with getVariantWithAdditionalStream:");
		
		long variant1 = myList.stream()
				.filter(element -> element.matches("\\w[^3]"))				
				.sorted((element1, element2) -> Integer.valueOf(element1.substring(1))
						.compareTo(Integer.valueOf(element2.substring(1))))				
				.sorted((element1, element2) -> element2.compareTo(element1))				
				.skip(1)
				.limit(myList.stream()
						.filter(element -> element.matches("\\w[^3]"))
						.skip(1)
						.count() - 1)				
				.map(String::toUpperCase)				
				.peek(System.out::println)
				.count();
		
		System.out.println("Number of remaining elements: " + variant1 + "\n");	
	}

}
