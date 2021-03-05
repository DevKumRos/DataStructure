package day10;

public class SelectionSorting {

	public static void main(String[] args) {
		int[] ar = {2, 7, 1, 3, 5, -1};
		//firstApporach(ar);
		secondApproach(ar);
		
	}

	private static void secondApproach(int[] ar) {
		for(int i=0; i<ar.length; i++) {
			int min = ar[i], pos = i;
			for(int j=i; j<ar.length; j++) {
				if(min > ar[j]) {
					min = ar[j];
					pos = j;
				}
			}
			int temp = ar[i];
			ar[i] = ar[pos];
			ar[pos] = temp;
			System.out.println(ar[i]);
		}
		
	}

	private static void firstApporach(int[] ar) {
		int[] br = new int[ar.length];
		for(int i=0; i<ar.length; i++) {
			br[i] = findMinElement(ar);
			System.out.println(br[i]);
		}
		
	}

	private static int findMinElement(int[] ar) {
		int min =ar[0];
		int pos = 0;
		for(int i=0; i<ar.length; i++) {
			if(min > ar[i]) {
				min = ar[i];
				pos = i;
			}
		}
		ar[pos] = Integer.MAX_VALUE;
		return min;
	}

}
