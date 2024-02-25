package eugenekru.javacourse.hometask07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pair<T> {
	
	private String className;
	
	private List<T> pairList = new ArrayList<>();

	public Pair(T element1, T element2) {
		this.pairList.add(element1);
		this.pairList.add(element2);
		this.className = element1.getClass().getSimpleName();
	}	
	
	private T first() {
		return this.pairList.get(0);
	}	
	
	private T last() {
		return this.pairList.get(pairList.size() - 1);
	}	
	
	private void swap() {
		Collections.reverse(pairList);		
	}
	
	
	private void replaceFirst(T element) {		
		pairList.set(0, element);
	}	
	
	private void replaceLast(T element) {		
		pairList.set((pairList.size() - 1), element);
	}	
	
	public void demoPairClassMethods(T element1, T element2) {
		
		T firstElement = first();
		T lastElement = last();
		Pair<T> pairDemo = new Pair<>(firstElement, lastElement);		
		System.out.println(className + "s first element: "
									 + pairDemo.first() + "\n");
		
		System.out.println(className + "s last element: "
									 + pairDemo.last() + "\n");
		
		pairDemo.swap();
		System.out.println(pairDemo.replaceFirst(" after swap:"));
		
		pairDemo.replaceFirst(element1);
		System.out.println(pairDemo.replaceFirst(" after replace first element:"));
		
		pairDemo.replaceLast(element2);
		System.out.println(pairDemo.replaceFirst(" after replace last element:"));		
	}

	@Override
	public String toString() {
		return "Pair of " + className + "s:\n" + pairList + "\n";
	}
	
	public String replaceFirst(String string) {
		return toString().replaceFirst(":", string);
	}

}
