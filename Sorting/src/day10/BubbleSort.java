package day10;

public class BubbleSort {

	public static void main(String[] args) {
		int[] ar = {2, 7, 1, 3, 5, -1};
		//bubbleSorting(ar);
		betterBbubbleSorting(ar);
	}
	
	private static void bubbleSorting(int[] ar) {
		for(int i=0; i<ar.length-1; i++) {
			for(int j=0; j<ar.length-1; j++) {
				if(ar[j]>ar[j+1]) {
					int x = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = x;
				}
				
			}
		}
		for(int x: ar) {
			System.out.print(x+ " ");
		}
	}
	
	private static void betterBbubbleSorting(int[] ar) {
		for(int i=0; i<ar.length-1; i++) {
			for(int j=0; j<ar.length-1-i; j++) {
				if(ar[j]>ar[j+1]) {
					int x = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = x;
				}
				
			}
		}
		for(int x: ar) {
			System.out.print(x+ " ");
		}
	}

}
