package day1;

public class Add4ElementAndGetMinAndMax {

	public static void main(String[] args) {
		int[] arr = {17, 6, 5, 1, 2};
		int sumArr = 0;
		int max = arr[0];
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			sumArr = sumArr +arr[i];
			
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		System.out.println("Sum of min 4 :"+(sumArr-max));
		System.out.println("Sum of max 4 :"+(sumArr-min));
	}

}
