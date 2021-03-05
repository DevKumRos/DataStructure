package day10;

public class InsertionSorting {

	public static void main(String[] args) {
		int[] ar = {9, 2, 7, 1, 3, 5, -1};
		insertionSortingMethod(ar); 

	}

	private static void insertionSortingMethod(int[] ar) {
		for(int i=0; i<ar.length-1; i++) {
			for(int j=i+1; j>0; j--) {
				if(ar[j]<ar[j-1]) {
					int x = ar[j];
					ar[j] = ar[j-1];
					ar[j-1] = x;
				}
			}
		}
		
		for(int x: ar) {
			System.out.print(x+ " ");
		}
		
	}

}
