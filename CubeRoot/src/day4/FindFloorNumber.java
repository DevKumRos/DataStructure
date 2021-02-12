package day4;

public class FindFloorNumber {

	public static void main(String[] args) {
		int[] arr = {-13, -5, -2, 3, 7, 8, 10, 15, 20, 22, 25};
		int num=28;
		System.out.println("***********First Approach*******************");
		System.out.println(normalApproach(num, arr));
		System.out.println("***********Second Approach*******************");
		System.out.println(binarySearchApproach(num, arr));

	}

	private static int binarySearchApproach(int num, int[] arr) {
		int ans = Integer.MIN_VALUE;
		int low =0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = (low+high)/2;
			int data = arr[mid];
			if(arr[mid]>num) {
				high = mid-1;
			} else if(arr[mid]<num) {
				ans = arr[mid];
				low = mid+1;
			} else if(arr[mid] == num) {
				ans = arr[mid];
				break;
			}
		}
		return ans;
	}

	private static int normalApproach(int num, int[] arr) {
		int ans = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<=num) {
				ans=arr[i];
			} else {
				break;
			}
		}
		return ans;
	}

}
