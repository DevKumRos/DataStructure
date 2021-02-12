package day4;

public class CubeRootNumber {

	public static void main(String[] args) {
		int num =125;
		System.out.println("***********First Approach*******************");
		System.out.println(bruteForceTechnix(num));
		System.out.println("***********Second Approach*******************");
		System.out.println(binarySearchTechnix(num));

	}
	
	private static long binarySearchTechnix(int num) {
		int low= 1;
		int high = num;
		long data = 0;
		while(low<=high) {
			long mid = (low+high)/2;
			if(mid*mid*mid > num) {
				high = (int) (mid-1);
			}else if(mid*mid*mid <num) {
				low = (int) (mid+1);
			} else if(mid*mid*mid == num) {
				data= mid;
				return mid;
			}
			
		}
		return data;
	}

	private static int bruteForceTechnix(int num) {
		int data = 0;
		for(int i=1; i*i*i<=num; i++) {
			if(i*i*i == num) {
				data= i;
				break;
			}
		}
		return data;
	}


}