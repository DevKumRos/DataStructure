package day10;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		//int[] nums = {1,2,3,4,5,6,7};
		int[] nums = {-1, -100, 3, 99};
		int k = 2;
		rotate(nums, k);
		rotate2Way(nums, k);

	}
	
	public static void rotate(int[] nums, int k) {
        int b[] = new int[nums.length];
        int n= nums.length;
        for(int i=0; i<n; i++) {
            b[(i+k)%n] = nums[i];
        }
        System.out.println(Arrays.toString(b));
    }
	
	public static void rotate2Way(int[] nums, int k) {
        int n= nums.length;
        for(int i=0; i<(n-k)/2; i++) {
            int x = nums[i];
            nums[i] = nums[(n-k)-i-1];
            nums[n-k-i-1] = x;
        }
        System.out.println(Arrays.toString(nums));
        int counter = n%2==0? (n/2)+k-1: (n/2)+k;
        for(int i=(n-k),j=1; i<counter; i++,j++) {
            int x = nums[i];
            nums[i] = nums[n-j];
            nums[n-j] = x;
        }
        System.out.println(Arrays.toString(nums));
        for(int i=0; i<n/2; i++) {
            int x = nums[i];
            nums[i] = nums[n-1-i];
            nums[n-1-i] = x;
        }
        
        System.out.println(Arrays.toString(nums));
    }

}
