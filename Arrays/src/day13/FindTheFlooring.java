package day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindTheFlooring {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        long[] ar = new long[num];
        for(int i=0; i<num; i++) {
            ar[i] = Long.parseLong(str[i]);
        }
        int queue = Integer.parseInt(br.readLine());
        for(int i=0; i<queue; i++) {
            int findNumber = Integer.parseInt(br.readLine());
            System.out.println(findFloorNumber(ar, findNumber));
        }
    }
    
    private static long findFloorNumber(long[] ar, int findNumber) {
    	long ans = Integer.MIN_VALUE;
    	int low = 0;
        int high = ar.length -1;
        int mid;
        while(low <= high) {
            mid = (low+high)/2;
            if(ar[mid] > findNumber) {
                high = mid-1;
            } else if(ar[mid] < findNumber) {
            	ans=ar[mid];
                low = mid +1;
            } else if(ar[mid] == findNumber){
            	ans=ar[mid];
            	return ans;
            }
            
        }
        return ans;
        
    }
}
