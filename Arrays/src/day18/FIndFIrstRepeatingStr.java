package day18;

import java.util.HashSet;

public class FIndFIrstRepeatingStr {

	public static void main(String[] args) {
		String str = "axyzbzxpq";
		char[] chAr = str.toCharArray();
		//findRepeatingNumber(chAr);
		secondApproach(chAr);

	}

	private static void secondApproach(char[] chAr) {
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0; i<chAr.length; i++) {
			if(!set.contains(chAr[i])) {
				set.add(chAr[i]);
			} else {
				System.out.println(chAr[i]);
			}
		}
		
	}

	private static void findRepeatingNumber(char[] chAr) {
		for(int i=0; i<chAr.length; i++) {
			for(int j=i+1; j<chAr.length; j++) {
				if(chAr[i] == chAr[j]) {
					System.out.print(chAr[i]);
					break;
				}
			}
		}
	}

}
