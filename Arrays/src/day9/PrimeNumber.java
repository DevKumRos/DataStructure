package day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {

	public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = Long.parseLong(br.readLine());
        System.out.println("****************First Aprroach**********");
        isPrimeNumber(num);
        System.out.println("****************Second Aprroach**********");
        
    }

	private static void isPrimeNumber(long num) {
		if(num<2){
            System.out.println("False");
            return;
        }
        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num%i == 0) {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
		
	}
	
	
}
