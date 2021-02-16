package day4;

import java.util.Scanner;

public class SearchAElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num = 6;//sc.nextInt();
        int arr[] = {0, 2, 3, 6, 6, 8};
		/*
		 * for(int i=0; i<num; i++) { arr[i] = sc.nextInt(); }
		 */
        int q = 4;//sc.nextInt();
        for(int j=1; j<=q; j++) {
            int k = sc.nextInt();
            System.out.println(binarySearch(arr,num,k));
        }
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
