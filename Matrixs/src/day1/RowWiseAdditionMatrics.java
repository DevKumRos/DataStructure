package day1;

public class RowWiseAdditionMatrics {

	public static void main(String[] args) {
		int[][] arr1 = {{2,1,3},{-1,20,8}, {8,-5,-11}};
		int row = arr1.length;
		int col = arr1[0].length;
		
		for(int i=0; i<row; i++) {
			int SUM = 0;
			for(int j=0; j<col; j++) {
				SUM =SUM+arr1[i][j];
			}
			System.out.println(SUM);
		}
		
		

	}

}
