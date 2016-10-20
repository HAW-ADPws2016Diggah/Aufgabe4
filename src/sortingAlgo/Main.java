package sortingAlgo;

import java.util.Arrays;
import java.util.Random;

public class Main {
	
	static int a_size = 150;
	static int n = 1;

	public static void main(String[] args) {
		
		Comparable[] a = new Comparable[a_size];
		
		long mergeTime = 0;
		long insertTime = 0;
		long selectTime = 0;
		long bubbleTime = 0;
		
		Comparable[] a_merge;
		Comparable[] a_insert;
		Comparable[] a_select;
		Comparable[] a_bubble;
		
		for (int i = 0; i < n; i++) {
			
			a = randomizeArray(a);
			
			a_merge = a.clone();
			a_insert = a.clone();
			a_select = a.clone();
			a_bubble = a.clone();
			
			mergeTime += doMerge(a_merge);
			insertTime += doInsertion(a_insert);
			selectTime += doSelection(a_select);
			bubbleTime += doBubble(a_bubble);	
			
		}
		
		System.out.println("Merge Zeit: " + mergeTime/n/1000 + " µs\n\n");
		System.out.println("Insert Zeit: " + insertTime/n/1000 + " µs\n\n");
		System.out.println("Select Zeit: " + selectTime/n/1000 + " µs\n\n");
		System.out.println("Bubble Zeit: " + bubbleTime/n/1000 + " µs\n\n");
		
	}
		
	private static long doMerge(Comparable[] a) {
	    		
		long start = System.nanoTime();	
		Merge.sort(a);
		long end = System.nanoTime();
		
		long time = end - start;
		
		return time;
		

	}
	
	private static long doInsertion(Comparable[] a) {

		long start = System.nanoTime();	
		Insertion.sort(a);
		long end = System.nanoTime();
		
		long time = end - start;
		
		return time;
	}
	
	private static long doSelection(Comparable[] a) {
	    
		long start = System.nanoTime();	
		Selection.sort(a);
		long end = System.nanoTime();
		
		long time = end - start;
		
		return time;
	}
	
	private static long doBubble(Comparable[] a) {
	    
		long start = System.nanoTime();	
		Bubble.sort(a);
		long end = System.nanoTime();
		
		long time = end - start;
		
		return time;
	}
	
	
	private static Comparable[] randomizeArray(Comparable[] a) {
		
		Random rng = new Random();
		
		for (int i = 0; i < a.length; i++) {
			int num = rng.nextInt(1000000) + 1;
			a[i] = num;
		}
		
		return a;
		
	}
	

}
