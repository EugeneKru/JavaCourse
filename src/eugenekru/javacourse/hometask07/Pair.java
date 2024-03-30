package eugenekru.javacourse.hometask07;


public class Pair<T1, T2> {
	
	private T1 element1;
	
	private T2 element2;

	public Pair(T1 element1, T2 element2) {		
		this.element1 = element1;
		this.element2 = element2;		
	}	
	
	public T1 first() {
		return element1;
	}
	
	public T2 last() {
		return element2;
	}
	
	public Pair<T2, T1> swap() {		
		return new Pair<>(this.element2, this.element1);		
	}
	
	public void replaceFirstElement(T1 element) {		
		this.element1 = element;		
	}	
	
	public void replaceLastElement(T2 element) {		
		this.element2 = element;
	}

	@Override
	public String toString() {		
		return "FirstElement of Pair is "
				+ element1.getClass().getSimpleName()
				+ ": " + element1 + "\n"
				+ "LastElement of Pair is "
				+ element2.getClass().getSimpleName()
				+ ": " + element2 + "\n";
	}	

}
