package day6;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorialNumber(num));
    }
    
    static int factorialNumber(int num) {
        return num > 0? num * factorialNumber(--num):1;
    }
}
