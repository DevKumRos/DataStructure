package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckArmstrongNumber {

	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        long[] ar = new long[num];
        for(int i=0; i<num; i++) {
            ar[i] = Long.parseLong(br.readLine());
        }
        checkArmstrongNumber(ar);
    }

	private static void checkArmstrongNumber(long[] ar) {
		for(int i=0; i<ar.length; i++) {
			long num = ar[i];
			long sum = 0;
			while(num > 0 ) {
				int qu = (int) (num%10);
				sum = sum+ qu*qu*qu;
				num = num/10;
			}
			System.out.println(ar[i]==sum? true:false);
		}
		
	}
}
