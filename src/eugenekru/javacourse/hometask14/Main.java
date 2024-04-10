package eugenekru.javacourse.hometask14;

public class Main {

	public static void main(String[] args) {
		
		Category fruit = Storage.createAndFillCategory("Fruit");	
		Category bakery = Storage.createAndFillCategory("Bakery");
		Category dairy = Storage.createAndFillCategory("Dairy");
		Category vegetables = Storage.createAndFillCategory("Vegetables");
		Category grains = Storage.createAndFillCategory("Grains");	
		
		Basket basket_1 = Storage.generateBasket(fruit, bakery, dairy, vegetables, grains);
		Basket basket_2 = Storage.generateBasket(fruit, bakery, dairy, vegetables, grains);
		
		basket_1.printOrder();
		basket_2.printOrder();
		
		Storage.setMinGoods(4);
		Storage.setMaxGoods(6);		
		
		Storage.printValueOrders(5, fruit, bakery, dairy, vegetables, grains);
				
				
		Storage.printRanking(fruit, bakery, dairy, vegetables, grains);
	}
	
	

}
