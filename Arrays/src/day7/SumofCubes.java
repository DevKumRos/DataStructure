package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * SUM = (n*(n+1)/2)^2
 * @author knagaraj
 *
 */
public class SumofCubes {

	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        long[] ar = new long[num];
        for(int i=0; i<num; i++) {
            ar[i] = Long.parseLong(str[i]);
        }
        for(int i=0; i<num; i++) {
            long sum = 0; 
            sum = ar[i]*(ar[i]+1)/2;
            sum = sum* sum;
            System.out.println(sum);
        }
    }
}
