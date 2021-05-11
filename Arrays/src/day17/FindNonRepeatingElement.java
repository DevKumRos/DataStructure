package day17;

public class FindNonRepeatingElement {

	public static void main(String[] args) {
		int[] ar = {1, 5, 8, 5, 7,12,1,12,8};
		System.out.println(findNonRepeatingElement(ar));
		System.out.println(findNonRepeatingElementXorOperation(ar));

	}
   
	static int findNonRepeatingElement(int[] ar) {
		// time complexiy : O(n^2)
    	for(int i=0; i<ar.length; i++) {
			boolean flag = true;
			for(int j=0; j<ar.length; j++) {
				if(i != j && ar[i] == ar[j]) {
					flag = false;
					break;
				}
			}
			if(flag) {
				return ar[i];
			}
		}
    	return 0;
    	
    }
	
	 private static int findNonRepeatingElementXorOperation(int[] ar) {
	    	// time complexiy : O(n)
	    	//a ^ a = 0,
	    	//a ^ 0 = a
			int result = 0;
	    	for(int data: ar) {
	    		result = result ^ data;
			}
			return result;
		}
}
