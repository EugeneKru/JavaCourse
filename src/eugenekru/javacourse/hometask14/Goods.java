package eugenekru.javacourse.hometask14;

public class Goods implements Comparable<Goods> {
	
	private String name;
	
	private double price;
	
	private int ranking;

	public Goods(String name, double price) {		
		this.name = name;
		this.price = price;
		this.ranking = 0;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getRanking() {
		return ranking;
	}
	
	public void changeRanking() {
		ranking++;		
	}	

	@Override
	public String toString() {
		return name + " " + price + " euro (rank " + ranking + ")";
	}

	@Override
	public int compareTo(Goods goods) {
		int value = goods.getRanking();
		return value - this.getRanking();
	}
	

}
