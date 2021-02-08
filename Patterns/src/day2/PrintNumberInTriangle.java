package day2;

public class PrintNumberInTriangle {

	public static void main(String[] args) {
		int n=5;
		int rowCounter =1;
		for(int i=1; i<=n; i++) {
			int colCounter =n-1;
			int sum = 0;
			for(int j=1; j<=i; j++) {
				if(j==1) {
					sum = rowCounter++;
				} else {
					sum = sum  + colCounter--;
				}
				System.out.print(sum);
			}
			System.out.println();
		}

	}

}
