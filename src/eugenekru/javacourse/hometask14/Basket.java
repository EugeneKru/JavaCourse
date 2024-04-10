package eugenekru.javacourse.hometask14;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Basket {
	
	private UUID orderID;
	
	private LocalDateTime dateTime;	
	
	private Map<Goods, String> goodsOrder;
	
	private static int counter = 1; //переменная введена для демонстрации изменения даты-времени у каждого нового чека

	public Basket() {		
		this.orderID = UUID.randomUUID();
		this.dateTime = LocalDateTime.now()
				.minusDays(10 - counter)
				.minusMinutes(200 - counter*27);
		this.goodsOrder = new HashMap<>();
		counter++;
	}	

	public Map<Goods, String> getGoodsOrder() {
		return goodsOrder;
	}

	public void putGoodsInBasket(Category сategory, Goods goods) {
		if(!goodsOrder.keySet().contains(goods)) {
			goodsOrder.put(goods, сategory.getName());
			goods.changeRanking();
		}
	}	
	
	private double countOrderSum() {		
		double ordersSum = 0;
		if(goodsOrder != null) {

			for(Map.Entry<Goods, String> entry : goodsOrder.entrySet()) {
				ordersSum += entry.getKey().getPrice();
			}
			
		}		
		return ordersSum;
	}
	
	public void printOrder() {
		String str = String.format("%37s%n", "");
		String dashString = str.replaceAll(" ", "-");
		
		System.out.printf("%-12s%26s%n", "\nOrder", 
				orderID.toString().replaceAll("(-\\w+)+-", "..."));
		
		System.out.printf("%-12s%25s%n", "Date",
				dateTime.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
		
		System.out.printf("%-12s%25s%n", "Time",
				dateTime.format(DateTimeFormatter.ofPattern("HH.mm")));
		
		System.out.print(dashString);
		System.out.printf("%-12s%-14s%-11s%n", "Goods", "Category", "Price");
		System.out.print(dashString);
		
		for(Map.Entry<Goods, String> entry : goodsOrder.entrySet()) {
			System.out.printf("%-12s%-14s%5s%6s%n", entry.getKey().getName(),
					entry.getValue(),
					String.format("%.2f",entry.getKey().getPrice()), " euro");
		}
		
		System.out.print(dashString);
		System.out.printf("%-12s%19s%7s%n", "Total",
				String.format("%.2f",countOrderSum()), " euro\n");	
	}	

}
