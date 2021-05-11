package day18;

public class ConvertUpperCaseStr {

	public static void main(String[] args) {
		String data = "Data";
		char[] dataArr = data.toCharArray();
		String elem  = "";
		approachSecond(dataArr);

	}

	private static void approachFirst(char[] dataArr) {
		for(char ch: dataArr ) {
			if(ch >= 65 && ch <=90) {
				ch = (char) (ch+32);
				System.out.print(ch);
			} else {
				ch = (char) (ch-32);
				System.out.print(ch);
			}
		}
	}
	
	private static void approachSecond(char[] dataArr) {
		for(char ch: dataArr ) {
			ch = (char) (ch^32);
			System.out.print(ch);
			
		}
	}

}
