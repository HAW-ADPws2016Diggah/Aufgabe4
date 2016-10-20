package sortingAlgo;

public class Bubble {
	
	static boolean bSwap;
	
	static public void sort(Comparable[] a) {
		
		int n = a.length;
		
		do {
			bSwap = false;
			for (int i = 0; i < n - 1; i++) {
				if (greater(a[i], a[i + 1])) {
					swap(a, i, i + 1);
					bSwap = true;
				}
			}
			n = n - 1;
		} while (bSwap && n > 1);

	}
	
    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }
    
    private static void swap(Comparable[] a, int i, int j) {
		Comparable temp = a[i];
		a[i] = a[i + 1];
		a[i + 1] = temp;
    }
	
}
