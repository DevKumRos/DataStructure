package day5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SumOfPairs {

	public static void main(String[] args) {
		int k= 12;
		int ar[] = {-4,-3,1,2,8,10,12,16};
		boolean status = false; 
		//Time Complexity O(n^2)
		for(int i=0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if( ar[i]+ar[j] == k) {
					status= true;
					break;
				}
			}
		
		}
		
		System.out.println(status);
	}

}
