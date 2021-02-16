package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchMissingNumber {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();
        String[] str = data.split(" ");
        int ar[] = new int[str.length];
        int num = 100;
        long total =0;
        for(int i=0; i<ar.length; i++) {
            ar[i] = Integer.parseInt(str[i]);
            total = total+ar[i];
        }
        long sum = num*(num+1)/2;
        System.out.println(sum-total);
        
    }
}
