package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionReverseArray {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String data = br.readLine();
        String[] str = data.split(" ");
        long ar[] = new long[num];
        for(int i=0; i<num; i++) {
            ar[i] = Long.parseLong(str[i]);
        }
        long[] brr = new long[ar.length];
        int k =0;
        reverseArray(k++, brr, ar);
        
        
	}

	private static void reverseArray(int i, long[] brr, long[] ar) {
		if(i<brr.length) {
			brr[i] = ar[ar.length-1-i];
			System.out.print(brr[i]+ " ");
			reverseArray(++i, brr, ar);
			
		}
		
		
	}

}
