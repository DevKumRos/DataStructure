package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Given N, check whether it is a Narcissistic number or not. A narcissistic number is a number that is the sum of its own digits each raised to the power of the number of digits

Input Format

First line contain no of test case-T Next Line contains T positive integer .

Constraints

1<=T<=10^5 0 <= N <= 10^18

Output Format

Print "true" if the number is Armstrong number, "false" otherwise.

Sample Input 0
2
32 8208

Sample Output 0
false
true

Explanation 0
3^2+2^2=6+4,10!=32 8^4 + 2^4 + 0^4 + 8^4 = 8208,8208==8208
 */
public class CheckNarcissisticNumbers {

	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        long[] ar = new long[num];
        String[] str = br.readLine().split(" ");
        int datalen[] = new int[num];
        for(int i=0; i<str.length; i++) {
            ar[i] = Long.parseLong(str[i]);
            datalen[i] = str[i].length();
        }
        narcissisticNumbers(ar, datalen);
    }

	private static void narcissisticNumbers(long[] ar, int datalen[]) {
		for(int i=0; i<ar.length; i++) {
			long data = ar[i];
			int squareTimes= datalen[i];
			long sum =0;
			while(data > 0) {
				long q = data%10;
				sum = sum+ (long)Math.pow(q, squareTimes);
				data = data/10;
			}
			System.out.println(ar[i] == sum? true: false);
		}
		
	}
	
}
