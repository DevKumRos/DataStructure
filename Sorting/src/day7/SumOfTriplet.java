package day7;

public class SumOfTriplet {

	public static void main(String[] args) {
		int[] ar = {-5,-2,3,5,8,10,12,25};
		int m =99;
		System.out.println("************First Approach** O(n3)***********");
		System.out.println(bruteForeceTechnic(ar, m));
		System.out.println("************Binary Search Approach Approach** O(n^2*logn)***********");
		System.out.println(binarySearchApproach(ar, m));
		System.out.println("************Three Approach Approach** O(n^2)***********");
		System.out.println(ThreePointerApproach(ar, m));
		
	}

	

	private static boolean bruteForeceTechnic(int[] ar, int m) {
		int num = ar.length;
		boolean status =false;
		int counter =0;
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				for(int k=0; k<num; k++) {
					counter++;
					if(i!=j && j!=k && i!=k && ar[i]+ar[j]+ar[k]== m) {
						status= true;
						break;
					}
				}
			}
		}
		System.out.println(counter);
		return status;
	}
//{-5,-2,3,5,8,10,12,25}
	private static boolean binarySearchApproach(int[] ar, int m) {
		int num = ar.length;
		boolean status =false;
		int counter =0;
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				int val = m-ar[i]-ar[j];
				int low=0, high = num-1, mid;
				while(low<=high) {
					counter++;
					mid = (low+high)/2;
					if(ar[mid]>val)
						high = mid -1;
					else if(ar[mid]<val)
						low = mid+1;
					else {
						if(mid != j && mid != i && i!=j) {
							status = true;
						}
						break;
					}
				}
				if(status)
					break;
			}
		}
		System.out.println(counter);
		return status;
	}
	
	private static boolean ThreePointerApproach(int[] ar, int m) {
		boolean status = false;
		int num = ar.length;
		int counter =0;
		for(int i=0; i<num; i++) {
			int low = 0, high = num-1;
			int val = m-ar[i];
			while(low<high) {
				counter++;
				if(ar[low]+ar[high] > val) {
					high--;
				} else if(ar[low]+ar[high]<val) {
					low++;
				} else if(low != i && high != i) {
					status = true;
					break;
				}
			}
		}
		System.out.println(counter);
		return status;
	}
}
