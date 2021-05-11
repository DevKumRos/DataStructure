package day17;

public class FindMissingNumberAndRepeatingNumber {

	public static void main(String[] args) {
		int[] ar = {1, 2, 3, 4, 7, 5, 7, 8, 9};
		int missingNumber = findMissingNumber(ar);
		int repeatingNumber = findRepeatingNumber(ar);
		System.out.println("missingNumber : "+missingNumber+", repeatingNumber:"+repeatingNumber);
		secondApporach(ar);
	}

	private static void secondApporach(int[] ar) {
		int num = 0;
		for(int i=0; i< ar.length; i++) {
			System.out.println("num : "+num+", ar["+i+"] : "+ar[i]+ "--> XOR num^ar[i]: "+(num ^ ar[i]));
			num = num ^ ar[i] ^ (i+1);
		}
		int b=0;
		for(int i=0; i<31; i++) {
			if(checkBit(num, i)) {
				b=i;
				break;
			}
		}
		System.out.println(num);
	}

	private static boolean checkBit(int num, int b) {
		if(num>0 && (1 << b) > 0) {
			return true;
		}
		return false;
	}

	private static int findMissingNumber(int[] ar) {
		for(int i=1; i<=ar.length; i++) {
			boolean status = true;
			for(int j= 0; j<ar.length; j++) {
				if(ar[j] == i) {
					status= false;
					break;
				}
			}
			if(status) {
				return i;
			}
		}
		return 0;
	}
	
	private static int findRepeatingNumber(int[] ar) {
		for(int i=0; i<=ar.length; i++) {
			boolean status = true;
			for(int j= 0; j<ar.length; j++) {
				if(i!= j && ar[j] == ar[i]) {
					status= false;
					break;
				}
			}
			if(!status) {
				return ar[i];
			}
		}
		return 0;
	}

}
