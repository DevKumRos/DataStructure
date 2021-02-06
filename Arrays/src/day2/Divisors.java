package day2;

public class Divisors {

	public static void main(String[] args) {
		
		int number = 10000;
		firstMethod(number);
		//secondMethod(number);
		thirdMethod(number);
		
		
	}
	
	

	private static void firstMethod(int number) {
		long createdTime = System.currentTimeMillis();
		int divisors=1;
		System.out.println("********************FIRST METHOD************************");
		while(divisors <= number) {
			if(number%divisors == 0) {
				System.out.println(divisors);
			}
			divisors++;
		}
		System.out.println("Time taken = "+(System.currentTimeMillis() - createdTime));
	}
	
	private static void secondMethod(int number) {
		int divisors=1;
		System.out.println("********************SECOND METHOD************************");
		System.out.println(divisors++);
		while(divisors <= number/2) {
			if(number%divisors == 0) {
				System.out.println(divisors);
			}
			divisors++;
		}
		System.out.println(number);
	}
	
	private static void thirdMethod(int number) {
		long createdTime = System.currentTimeMillis();
		int divisors=1;
		System.out.println("********************Third METHOD************************");
		System.out.println(divisors++);
		int number1= (int) Math.sqrt(number);
		while(divisors <= number1) {
			if(number%divisors == 0) {
				System.out.println(divisors);
				if(number/divisors !=divisors )
					System.out.println(number/divisors);
			}
			divisors++;
		}
		System.out.println(number);
		System.out.println("Time taken = "+(System.currentTimeMillis() - createdTime));
	}
}
