package day1;

public class Add2Matrices {

	public static void main(String[] args) {
		int[][] arr1 = {{1,2},{3, 4}};
		int[][] arr2 = {{7,8},{9, 10}};
		int[][] temp = new int[2][2];
		int rows = arr1.length;
		int cols = arr1[0].length;
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				temp[i][j] = arr1[i][j]+arr2[i][j];
				System.out.println(temp[i][j]);
			}
		}
		

	}

}
