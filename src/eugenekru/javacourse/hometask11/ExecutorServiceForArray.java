package eugenekru.javacourse.hometask11;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorServiceForArray {

	public static void main(String[] args) throws InterruptedException {
		
		int[] array = ArrayBuilder.createArray();
		AtomicInteger minElement = new AtomicInteger();
		AtomicInteger maxElement = new AtomicInteger();
		
		ExecutorService executer =  Executors.newFixedThreadPool(2);
		
		executer.execute(() -> {
			int min = findMinElement(array);
			minElement.addAndGet(min);
		});
		executer.execute(() -> {
			int max = findMaxElement(array);
			maxElement.addAndGet(max);
		});
		
		executer.shutdown();
		executer.awaitTermination(100, TimeUnit.MILLISECONDS);

		System.out.println("\nMIN element in the array: " + minElement
				+ "\nMAX element in the array: " + maxElement + "\n");
		
		System.out.println("\nProgram is succesfully executed.");	

	}
	
	private static int findMinElement(int[] array) {
		int min = Arrays.stream(array)
				.min()
				.getAsInt();
		
		return min;		
		}
	
	private static int findMaxElement(int[] array) {
		int max = Arrays.stream(array)
				.max()
				.getAsInt();
		
		return max;		
		}

}
