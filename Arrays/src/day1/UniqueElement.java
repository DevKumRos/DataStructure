package day1;

public class UniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 1, 3, 5, 7, 6, 1, 3, 4, 2, 1};
		for(int i=0; i<arr.length; i++) {
			int count =0;
			for(int j=0; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
					if(count == 2)
						break;
				}
			}
			if(count == 1) 
				System.out.println(arr[i]);
		}
		System.out.println("***************SECOND WAY***********************");
		//Alternate wAY
		for(int i=0; i<arr.length; i++) {
			boolean unique = true;
			for(int j=0; j<arr.length; j++) {
				if(i!= j && arr[i] == arr[j]) {
					unique = false;
						break;
				}
			}
			if(unique) 
				System.out.println(arr[i]);
		}
	}

}
