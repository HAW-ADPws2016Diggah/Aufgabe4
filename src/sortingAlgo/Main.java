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
		
		int mergeTemp=0;
		int mergeMin=0;
		int mergeMax=0;
		int insertMin=0;
		int insertTemp=0;
		int insertMax=0;
		int selectMin=0;
		int selectTemp=0;
		int selectMax=0;
		int bubbleMin=0;
		int bubbleTemp=0;
		int bubbleMax=0;
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
			
			//initialiesierung f�r leere variablen
			if(mergeMin == 0){mergeMin=mergeTemp/a_size;}
			if(mergeMax == 0){mergeMax=mergeTemp/a_size;}
			
			
			if(insertMin == 0){insertMin=insertTemp/a_size;}
			
			if(insertMax == 0){insertMax=insertTemp/a_size;}
			
			if(selectMin == 0){selectMin=selectTemp/a_size;}
			
			if(selectMax == 0){selectMax=selectTemp/a_size;}
			
			if(bubbleMin == 0){bubbleMin=bubbleTemp/a_size;}
			
			if(bubbleMax == 0){bubbleMax=bubbleTemp/a_size;}
			
			
			if(mergeMin > (mergeTemp/a_size)){mergeMin = mergeTemp/a_size; }
			if(mergeMax < (mergeTemp/a_size)){mergeMax = mergeTemp/a_size;}
			if(insertMin < (insertTemp/a_size)){insertMin = insertTemp/a_size;}
			if(insertMax > (insertTemp/a_size)){insertMax = insertTemp/a_size;}
			if(selectMin < (selectTemp/a_size)){selectMin = selectTemp/a_size;}
			if(selectMax > (selectTemp/a_size)){selectMax = selectTemp/a_size;}
			if(bubbleMin < (bubbleTemp/a_size)){bubbleMin = bubbleTemp/a_size;}
			if(bubbleMax > (bubbleTemp/a_size)){bubbleMax = bubbleTemp/a_size;}
			
			
			
		}
		
		System.out.println("Merge Zeit: " + mergeTime/n/1000/1000 + " ms\n");
		System.out.println("Merge min: "+mergeMin/1000+"mueckkcro Sekunden,  Max: "+mergeMax/1000+"muekkckckcrosekunden");
		System.out.println("Insert Zeit: " + insertTime/n/1000/1000 + " ms\n");
		System.out.println("Select Zeit: " + selectTime/n/1000/1000 + " ms\n");
		System.out.println("Bubble Zeit: " + bubbleTime/n/1000/1000 + " ms\n");
		
		/*
		System.out.println("Merge Zeit: " + mergeTime/n/1000 + " µs\n\n");
		System.out.println("Insert Zeit: " + insertTime/n/1000 + " µs\n\n");
		System.out.println("Select Zeit: " + selectTime/n/1000 + " µs\n\n");
		System.out.println("Bubble Zeit: " + bubbleTime/n/1000 + " µs\n\n");*/
		
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
