package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * SUM = n*(n+1)/2
 * @author knagaraj
 *
 */

public class SumfirstNaturalNumber {

	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        long[] ar = new long[num];
        for(int i=0; i<num; i++) {
            ar[i] = Long.parseLong(br.readLine());
        }
        for(int i=0; i<num; i++) {
            long sum = 0; 
            sum = ar[i]*(ar[i]+1)/2;
            System.out.println(sum);
        }
    }
}
