package eugenekru.javacourse.hometask08;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyMap {
	
	private Map<Character, Integer> map = new LinkedHashMap<>();
	
	public Map<Character, Integer> getCharsCount(String string) {	
		
		for (int i = 0; i < string.length(); i++) {
			
			if(map.containsKey(string.charAt(i))) {
				map.put(string.charAt(i), map.get(string.charAt(i)) + 1);				
			} else {
				map.put(string.charAt(i), 1);				
			}
		}
		
		return map;		
	}

	@Override
	public String toString() {
		return "Map:\n" + map;
	}
	
}
