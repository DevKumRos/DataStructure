package day5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*Constraints

1 <= N <= 10^5 -10^18 <= ar[i] <= 10^18

Output Format

Print the minumum and maximum element of array.

Sample Input 
5
-2 -19 8 15 4

Sample Output 0

-19 15*/

public class MinAndMaxArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String data = br.readLine();
        String[] str = data.split(" ");
        long ar[] = new long[num];
        for(int i=0; i<num; i++) {
            ar[i] = Long.parseLong(str[i]);
        }
        long min =ar[0];
        long max = ar[0];
        for(int i=0; i<ar.length; i++) {
            
            if(ar[i] > max) {
                max = ar[i];
            } else if(ar[i] < min) {
                min = ar[i];
            }
        }
        System.out.println(min+" "+max);
	}

}
