package day4;

public class SquareRootData {

	public static void main(String[] args) {
		long num =1000000000000000000L;
		System.out.println("***********First Approach*******************");
	//	System.out.println(bruteForceTechnix(num));
		System.out.println("***********Second Approach*******************");
		System.out.println(binarySearchTechnix(num));
		System.out.println("***********Third Approach*******************");
	//	System.out.println(thirdSqrt(num));
		
	}
	
	private static long binarySearchTechnix(long num) {
		long low= 1;
		long high = num;
		long data = 0;
		while(low<=high) {
			long mid = (low+high)/2;
			if(mid>=-1e9 && mid<=1e9) {
				if(mid*mid > num) {
					high = (int) (mid-1);
				}else if(mid*mid <num) {
					low = (int) (mid+1);
				} else if(mid*mid == num) {
					data= mid;
					return mid;
				}
			} else {
				high = mid - 1;
			}
		}
		return data;
	}

	private static int bruteForceTechnix(int num) {
		int data = 0;
		for(int i=1; i*i<=num; i++) {
			if(i*i == num) {
				data= i;
				break;
			}
		}
		return data;
	}
	
	private static int thirdSqrt(long num) {
		long sum = (long) num;
		while(sum*sum > num) {
			System.out.println(num/sum);
			sum = (sum+ num/sum)/2;
		}
		return (int)sum;
	}

}
