package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Constraints


Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)

Sample Input

1 2 3 4 5
Sample Output

10 14
Explanation

The numbers are , , , , and . Calculate the following sums using four of the five integers:

1+2+3+4 = 10
2+3+4+5 = 14
*/

public class SumOfMiniMaxFourOfArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();
        String[] str = data.split(" ");
        long ar[] = new long[str.length];
        for(int i=0; i<str.length; i++) {
            ar[i] = Long.parseLong(str[i]);
        }
        long min =ar[0];
        long max = ar[0];
        long sum = 0;
        for(int i=0; i<ar.length; i++) {
        	sum = sum+ar[i];
            if(ar[i] > max) {
                max = ar[i];
            } else if(ar[i] < min) {
                min = ar[i];
            }
        }
        System.out.println((sum-max)+" "+(sum-min));

	}

}
