package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareSum {
	/**
	 * SUM = n*(n+1)*(2n+1)/6
	 * @author knagaraj
	 *
	 */
	
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        long[] ar = new long[num];
        String[] str = br.readLine().split(" ");
        for(int i=0; i<str.length; i++) {
            ar[i] = Long.parseLong(str[i]);
        }
        squareSum(ar);
    }

	private static void squareSum(long[] ar) {
		
		for(long data: ar) {
			long sum = 0; 
			sum = (data*(data+1)*(2*data+1))/6;
			System.out.println(sum);
		}
		
	}

}
