package day18;

import java.util.Stack;

public class FindFirstMininmumNumber {

	public static void main(String[] args) {
		int[] arr = {10, 3, 15, 25,9, 12, 17, 2, 5,9,4,8};
		//bruteForceApproach(arr);
		findSmaller(arr);
	}

	private static void findSmaller(int[] ar) {
		int num = ar.length;
		int[] br = new int[ar.length];
		Stack<Integer> st = new Stack<Integer>();
		st.push(0);
		for(int i=1; i<num; i++) {
			System.out.println("Size: "+st.size()+", last Elem:"+st.lastElement()+", i :"+ar[i]+", top elem:"+ar[st.lastElement()]);
			while(st.size() > 0 && ar[i] <=ar[st.lastElement()]) {
				br[st.lastElement()] = ar[i];
				st.pop();
			}
			st.push(i);
		}
		while(st.size() != 0) {
			br[st.lastElement()] = -1;
			st.pop();
		}
		for(int data: br) {
			System.out.println(data);
		}
	}

	private static void bruteForceApproach(int[] arr) {
		int minNumber = arr[0];
		int[] brr = new int[arr.length];
		for(int i=0; i< arr.length; i++) {
			boolean status = false;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					System.out.println(arr[j]);
					brr[i] = arr[j];
					status = true;
					break;
				}
			}
			if(!status) {
				brr[i] = -1;
				System.out.println(-1);
			}
		}
		
	}

}
