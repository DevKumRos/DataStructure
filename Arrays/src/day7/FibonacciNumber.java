package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(fibonacciNumber(num));

	}

	private static long fibonacciNumber(int num) {
		long a = 0;
		long b = 1;
		long sum = 0;
		while(0 < num) {
            sum = a+b;
            a=b;
            b = sum;
            num--;
        }
		return sum;
	}

}
