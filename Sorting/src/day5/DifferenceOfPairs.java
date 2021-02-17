package day5;

public class DifferenceOfPairs {

	public static void main(String[] args) {
		int k= 21;
		int ar[] = {-4,-3,-2,1,2,8,10,12,16};
		System.out.println("************First Approach**O(n2)*************");
		System.out.println(firstApproach(ar, k));
		System.out.println("************Second Approach***O(nlog(n))************");
		System.out.println(binarySearchApproach(ar, k));
		System.out.println("************Third Approach*** O(n)************");
		System.out.println(twoPointerApproach(ar, k));
	}

	
	private static boolean firstApproach(int[] ar, int k) {
		for(int i=0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length;j++) {
				if(ar[j]-ar[i] == k) {
					return true;
				} 
			}
		}
		return false;
	}
//{-4,-3,-2,1,2,8,10,12,16};
	private static boolean binarySearchApproach(int[] ar, int k) {
		for(int i=0; i<ar.length; i++) {
			int val = k + ar[i];
			int low=0,high= ar.length-1,mid;
			while(low<=high) {
				mid = (low+high)/2;
				if(ar[mid] > val) {
					high = mid-1;
				} else if(ar[mid]<val) {
					low = mid+1;
				} else {
					return true;
				}
			}
		}
		return false;
	}
	//{-4,-3,-2,1,2,8,10,12,16}
	private static boolean twoPointerApproach(int[] ar, int k) {
		int firstIndex = 0;
		int lastIndex = ar.length-1;
		while(firstIndex<lastIndex) {
			if(ar[lastIndex]-ar[firstIndex] > k) {
				firstIndex++;
			} else if(ar[lastIndex]-ar[firstIndex] < k ) {
				lastIndex--;
			} else if(firstIndex != lastIndex) {
				return true;
			}
		}
		return false;
	}


}
