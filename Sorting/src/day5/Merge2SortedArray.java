package day5;

public class Merge2SortedArray {

	public static void main(String[] args) {
		int ar[] = {3,8,10,18,25};
		int br[] = {-2,1,5,9,11, 13,14};
		// Time Complexity O(n+m)
		merge2SortedArray(ar, br);
		// Time Complexity O(n+m)
		secondWay(ar, br);

	}

	private static void secondWay(int[] ar, int[] br) {
		int cr[] = new int[ar.length+ br.length];
		int apntr = 0;
		int bpntr = 0;
		int cpntr = 0;
		while(bpntr < br.length && apntr < ar.length) {
			if(ar[apntr] > br[bpntr]) {
				cr[cpntr++] = br[bpntr++];
			} else if(ar[apntr] < br[bpntr]  ) {
				cr[cpntr++] =  ar[apntr++];
			}
			System.out.println();
		}
		while(bpntr < br.length) {
			cr[cpntr++] = br[bpntr++];
		}
		while(apntr < ar.length) {
			cr[cpntr++] =  ar[apntr++];
		}
		for(int i : cr) {
			System.out.println(i);
		}
	}

	private static int[] merge2SortedArray(int[] ar, int[] br) {
		int cr[] = new int[ar.length+ br.length];
		int apntr = 0;
		int bpntr = 0;
		for(int k=0; k<cr.length; k++) {
			if(bpntr < br.length && apntr < ar.length && ar[apntr] > br[bpntr] ) {
				cr[k] = br[bpntr++];
			} else if(apntr < ar.length && bpntr < br.length && ar[apntr] < br[bpntr] ) {
				cr[k] = ar[apntr++];
			} else {
				if(apntr < ar.length)
				   cr[k] = ar[apntr++];
				else if(bpntr < br.length)
					cr[k] = br[bpntr++];
			}
			System.out.println(cr[k]);
		}
		return cr;
	}

	

}
