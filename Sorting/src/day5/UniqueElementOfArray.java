package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UniqueElementOfArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String data = br.readLine();
        String[] str = data.split(" ");
        long ar[] = new long[num];
        for(int i=0; i<num; i++) {
            ar[i] = Long.parseLong(str[i]);
        }
        boolean existStatus = false;
        for( int i=0; i<ar.length-1; i++) {
        	existStatus = false;
        	for(int j=0; j<ar.length; j++) {
        		if(i != j && ar[i] == ar[j] ) {
        			existStatus = true;
        			break;
        		}
        	}
        	if(!existStatus) {
        		System.out.print(ar[i]+" ");
        	}
        }

	}

}
