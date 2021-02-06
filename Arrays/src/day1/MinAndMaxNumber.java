package day1;

public class MinAndMaxNumber {

	public static void main(String[] args) {
		//int[] arr = {8,-1,3,2,5,6,13};
		int[] arr = {2, 1, 3, 5, 7, 6};
		int minNum = arr[0], maxNum=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > maxNum) {
				maxNum = arr[i];
			}
			if(arr[i] < minNum) {
				minNum = arr[i];
			} 
		}
		System.out.println("minNum : "+minNum+", maxNum: "+maxNum);

	}

}
