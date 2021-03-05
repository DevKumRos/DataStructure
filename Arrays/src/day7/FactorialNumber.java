package day7;

import java.util.Date;
import java.util.Scanner;
import java.util.stream.LongStream;

public class FactorialNumber {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long createdTime = new Date().getTime();
        System.out.println(factorialUsingStreams(num));
        System.out.println("Time Taken = "+(new Date().getTime()-createdTime));
    }
    
    static long factorialNumber(long num) {
    	long fact = num >= 1? num * factorialNumber(--num):1;
        return fact%1000000007;
    }
    
    static long factorialNumberSecondWay(int num) {
    	long fact = 1;
    	for(int i=1; i<=num; i++) {
    		fact = fact * i;
    		fact = fact%1000000007;
    		System.out.println(" i = "+i+", fact= "+fact+", Mod = "+fact);
    	}
        return fact;
    }
    
    public static long factorialUsingStreams(int n) {
        return LongStream.rangeClosed(1, n)
            .reduce(1, (long x, long y) -> (x * y)%1000000007);
    }
    
}
