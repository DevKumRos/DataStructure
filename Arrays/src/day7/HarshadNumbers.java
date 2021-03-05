package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Determine whether the given number is a Harshad number. A Harshad number is an integer, that is divisible by the sum of its digits.

Input Format

First line contain no of test case-T Next- Line contains T positive integer .

Constraints

1<=T<=10^5 0 <= N <= 10^18

Output Format

Print "true" if the number is Harshad number, "false" otherwise.

Sample Input 0

2
18 19
Sample Output 0

true
false
Explanation 0

18 / (1 + 8) = 2 As 18 is divisible by the sum of its digits, it is harshad number. 19 / (1 + 9) = 1.9 As 19 is not divisible by the sum of its digits, it is not the harshad number.
 * */
public class HarshadNumbers {

	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        long[] ar = new long[num];
        String[] str = br.readLine().split(" ");
        for(int i=0; i<str.length; i++) {
            ar[i] = Long.parseLong(str[i]);
        }
        harshadNumbers(ar);
    }

	private static void harshadNumbers(long[] ar) {
		for(long val: ar) {
			long sum =0;
			long data = val;
			while(data>0) {
				long qu = data%10;
				sum = sum + qu;
				data = data/10;
			}
			System.out.println(val%sum ==0? true: false);
		}
		
	}
}
