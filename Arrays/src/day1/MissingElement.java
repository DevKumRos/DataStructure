package day1;

public class MissingElement {

	public static void main(String[] args) {
		int[] arr = {9, 7, 4, 2, 8, 1, 10};
		int numberofElements = 10;
		for(int i=1; i<=numberofElements; i++) {
			boolean missing = true;
			for(int j=0; j<arr.length; j++) {
				if(arr[j] == i) {
					missing =false;
					break;
				}
			}
			if(missing) {
				System.out.println(i);
			}
		}

	}

}
