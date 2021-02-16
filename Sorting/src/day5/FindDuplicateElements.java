package day5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class FindDuplicateElements {

	public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        if(num < 2 )
          throw new IllegalArgumentException("Test data");
        String data = br.readLine();
        String[] str = data.split(" ");
        int ar[] = new int[num];
        for(int i=0; i<num; i++) {
            ar[i] = Integer.parseInt(str[i]);
        }
        printRepeatingNumber(ar);
        boolean existStatus = false;
        int lowValue = Integer.MIN_VALUE;
        for( int i=0; i<ar.length-1; i++) {
            existStatus = false;
            for(int j=i+1; j<ar.length; j++) {
                if(ar[i] == ar[j] ) {
                    existStatus = true;
                    ar[j]=lowValue++;
                }
            }
            if(existStatus) {
               // bw.write(ar[i]+" ");
            }
        }
        bw.flush();
    
    }

	private static void printRepeatingNumber(int[] ar) {
		HashSet set = new HashSet();
		for(int ard: ar ) {
			if(set.add(ard) == false) {
				System.out.print(ard+" ");
			}
		}
		
	}

	
}
