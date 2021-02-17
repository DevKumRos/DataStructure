package day5;

public class SumOfPairs {

	public static void main(String[] args) {
		int k= 22;
		int ar[] = {-4,-2,-3,1,2,8,10,12,16};
		System.out.println("************First Approach**O(n2)*************");
		System.out.println(firstApproach(ar, k));
		System.out.println("************Second Approach***O(nlog(n))************");
		System.out.println(binarySearchApproach(ar, k));
		System.out.println("************Third Approach*** O(n)************");
		System.out.println(twoPointerApproach(ar, k));
	}
	
	private static boolean firstApproach(int[] ar, int k) {
		boolean status = false; 
		//Time Complexity O(n^2)
		for(int i=0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if( ar[i]+ar[j] == k) {
					status= true;
					break;
				}
			}
		
		}
		return status;
	}



	private static boolean binarySearchApproach(int[] ar, int k) {
		for(int i=0; i<ar.length; i++) {
			int val = k-ar[i];
			int index = binarySearch(ar, k, val);
			if(index != -1 && index != i)
				return true;
		}
		return false;
	}

	private static int binarySearch(int[] ar, int k, int val) {
		int low = 0;
		int high = ar.length-1;
		int mid;
		while(low<=high) {
			mid = (low+high)/2;
			if(ar[mid] > val) {
				high = mid -1;
			} else if(ar[mid] < val) {
				low = mid+1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	private static boolean twoPointerApproach(int[] ar, int k) {
		int firstIndex = 0;
		int lastIndex = ar.length -1;
		while(firstIndex < lastIndex ) {
			if(ar[firstIndex]+ar[lastIndex] > k) {
				lastIndex--;
			} else if(ar[firstIndex]+ar[lastIndex] < k) {
				firstIndex++;
			} else if(firstIndex != lastIndex) {
				return true;
			}
		}
		return false;
	}

}
