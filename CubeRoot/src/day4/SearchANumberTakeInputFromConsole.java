package day4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SearchANumberTakeInputFromConsole {

	public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String data = br.readLine();
        String[] str = data.split(" ");
        int arr[] = new int[num];
        for(int i=0; i<num; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int q = Integer.parseInt(br.readLine());
        for(int j=1; j<=q; j++) {
            int k = Integer.parseInt(br.readLine());
            bw.write(binarySearch(arr,num,k)+"\n");
        }
        bw.flush();
    }
    
    private static boolean binarySearch(int[] arr, int n, int k) {
        int low=0, high=n-1; 
        while(low<=high) {
            int mid = (low+high)/2;
            if(arr[mid]>k)
                high=mid-1;
            else if(arr[mid]<k)
                low = mid+1;
            else if(arr[mid] == k)
                return true;
                
        }
        return false;
    }

}
