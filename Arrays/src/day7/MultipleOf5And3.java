package day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleOf5And3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        long[] ar = new long[num];
        for(int i=0; i<num; i++) {
            ar[i] = Long.parseLong(br.readLine());
        }
        for(int i=0; i<ar.length; i++) {
            long qu = ar[i]%3;
            long num3 = (ar[i]- qu) > 0? (ar[i]- qu)/3 : 0;
            qu = ar[i]%5;
            long num5 = (ar[i]- qu) > 0? (ar[i]- qu)/5 : 0;
            qu = ar[i]%15;
            long num15 = (ar[i]- qu) > 0? (ar[i]- qu)/15 : 0;
            System.out.println(num3+num5-num15);
        }
    }
}
