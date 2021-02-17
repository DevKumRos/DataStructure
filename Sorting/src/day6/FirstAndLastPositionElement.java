package day6;

import java.io.IOException;

public class FirstAndLastPositionElement {

	 public static void main(String[] args) throws NumberFormatException, IOException {
		 int[] nums = {5,7,7,8,8,10};
	     int target = 7;
	     searchRange(nums, target);
		}
	    public static int[] searchRange(int[] nums, int target) {
	        int floorEnd = findPosition(nums, target , true);
	        int celingEnd = findPosition(nums, target , false);
	        System.out.println("["+floorEnd+","+ celingEnd+"]");
	        int[] data = {floorEnd, celingEnd};
 	        return data;
	    }
	    
	    public static int findPosition(int[] nums, int target, boolean floor) {
	        int low = 0;
	        int high = nums.length -1;
	        int mid;
	        int position = -1;
	        while(low<=high) {
	            mid = (low+high)/2;
	            if(nums[mid] > target) {
	                high = mid-1;
	            } else if( nums[mid]< target) {
	                low = mid+1;
	            } else {
	            	position = mid;
	                if(floor) {
	                    high = mid-1;
	                } else  {
	                    low = mid+1;
	                }
	                
	                    
	            }
	        }
	        return position;
	    }
}
