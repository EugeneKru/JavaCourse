package eugenekru.javacourse.hometask14;

import java.util.ArrayList;
import java.util.List;

public class Category {
	
	private String name;
	
	private List<Goods> goodsList;

	public Category(String name) {		
		this.name = name;
		this.goodsList = new ArrayList<>();
	}
	
	public String setName() {
		return name;
	}

	public String getName() {
		return name;
	}

	public List<Goods> getGoodsList() {
		return goodsList;
	}
	
	public void putGoodsInCategory(Goods...goods) {
		
		for(Goods el: goods) {
			if(!goodsList.contains(el)) {
				goodsList.add(el);		
			}
		}
		
	}

	@Override
	public String toString() {
		return name + " :\n" + goodsList;
	}

}
