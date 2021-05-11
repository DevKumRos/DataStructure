package day17;

public class BitwiseOperator {

	public static void main(String[] args) {
		int a = 26;
		System.out.println(pow2(6));
		System.out.println(pow(2, 6));

	}
	
	static long pow2(int n) {
		return 1<<n;
	}
	
	static long pow(int a, int n) {
		long result = a;
		while(n>1) {
			result = result*a;
			n--;
		}
		return result ;
	}

}
