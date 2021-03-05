package day8;

public class PowOfAAndB {

	public static void main(String[] args) {
		int ar[] = {4, 3};
		System.out.println(powOfAAndB(ar));
	}
	
	static long powOfAAndB(int[] ar) {
		long prod = 1;
		for(int i=0; i<ar[1]; i++) {
			prod =prod*ar[0];
		}
		return prod;
	}

}
