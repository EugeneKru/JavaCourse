package eugenekru.javacourse.hometask14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Storage {
	
	private static String[][] goodsNames = {
			{"Bakery", "bread", "pie", "loaf", "cookies"},
			{"Fruit", "apples", "bananas", "plums", "oranges", "pears"},
			{"Dairy", "milk", "cheese", "cream", "butter"},
			{"Vegetables", "potatoes", "onions", "carrots", "tomatoes"},
			{"Grains", "buckwheat", "rice", "pasta", "oats"}
			};
	
	private static int minGoods = 1;
	
	private static int maxGoods = 4;
	
	private static Random rand = new Random();	
	
	public static int getMinGoods() {
		return minGoods;
	}

	public static void setMinGoods(int minGoods) {
		Storage.minGoods = minGoods;
	}

	public static int getMaxGoods() {
		return maxGoods;
	}
	
	public static void setMaxGoods(int maxGoods) {
		Storage.maxGoods = maxGoods;
	}
		
	private static double getGoodsPrice() {		
		return (double)rand.nextInt(1, 2000) / 100;
	}	
	
	public static Category createAndFillCategory(String name) {
		Category сategory = new Category(name);
		
		for(int i = 0; i < goodsNames.length; i++) {
			if(goodsNames[i][0].matches(name)) {				
			
			for(int j = 1; j < goodsNames[0].length; j++) {
					сategory.putGoodsInCategory(new Goods(goodsNames[i][j],
							getGoodsPrice()));				
				}
			
			}			
		}
				
		return сategory;
	}
	
	public static Basket generateBasket(Category...category) {
		Basket basket = new Basket();
		int valueOfGoods = rand.nextInt(minGoods, (maxGoods + 1));
		
		for(int i = 0; i < valueOfGoods; i++) {			
			int numberOfCategory = rand.nextInt(goodsNames.length);
			int numberOfGoodsInCategory = category[numberOfCategory]
					.getGoodsList()
					.size();
			
			int basketSizeBefore = basket.getGoodsOrder().size();
			basket.putGoodsInBasket(category[numberOfCategory],
					category[numberOfCategory]
							.getGoodsList()
							.get(rand.nextInt(numberOfGoodsInCategory)));
			
			int basketSizeAfter = basket.getGoodsOrder().size();
			if(basketSizeAfter == basketSizeBefore) {
				i--;
			}
		}		
		
		return basket;
	}
	
	public static void printValueOrders(int value, Category...category) {		
		
		for(int i = 0; i < value; i++) {			
			Storage.generateBasket(category).printOrder();
		}		
				
	}
	
	public static void printRanking(Category...categorie) {
		List<Goods> rankingList = new ArrayList<>();
		
		for(int i = 0; i < goodsNames.length; i++) {
			List<Goods> middleList = categorie[i].getGoodsList().stream()
						.filter(goods -> goods.getRanking() > 0)
						.toList();
			rankingList.addAll(middleList);
			}
		
		rankingList.stream().sorted().forEach(System.out::println);
	}

}
