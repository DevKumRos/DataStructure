package day4;

public class FindTheRepeatingNumber {

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,2,2,2,3,3,3,4,4,4,4};
		int findNumber = 2;
		int leftIndex= floorNumber(arr, findNumber);
		System.out.println(leftIndex);
		int rightIndex= celNumber(arr, findNumber);
		System.out.println(rightIndex);
		System.out.println("*************Counter**********************");
		System.out.println(rightIndex-leftIndex+1);

	}

	private static int celNumber(int[] arr, int k) {
		int low=0, high=arr.length-1, ans=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]> k){
				high = mid-1;
			} else if(arr[mid]<k) {
				low = mid+1;
			} else {
				ans = mid;
				low = mid+1;
			}
		}
		return ans;
	}

	private static int floorNumber(int[] arr, int k) {
		int low=0, high=arr.length-1, ans=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]> k){
				high = mid-1;
			} else if(arr[mid]<k) {
				low = mid+1;
			} else {
				ans = mid;
				high = mid-1;
			}
		}
		return ans;
	}

}
