package eugenekru.javacourse.hometask12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsyncCount {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("Original list of integers:\n" + numbersList);
		
		List<Integer> futureInteger = new ArrayList<>();
		
		List<CompletableFuture<Double>> asyncCount = numbersList.stream()
				.map(qw -> CompletableFuture.supplyAsync(() -> Math.pow(qw, 2)))
				.toList();		
		
		for(CompletableFuture<Double> el: asyncCount) {
			futureInteger.add(el.get().intValue());
		}		
		
		System.out.println("\nList of integers after changes:\n" + futureInteger);		
	}	

}
