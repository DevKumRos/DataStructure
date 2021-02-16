package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckForValidTriangle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String[] strData = new String[num];
		for(int i=0; i<num; i++) {
			String data = br.readLine();
			strData[i] = data;
	   }
		checkTriangleValid(strData);
	}

	private static void checkTriangleValid(String[] strData) {
		for(String data: strData) {
			String[] str = data.split(" ");
			long a = Long.parseLong(str[0]);
			long b = Long.parseLong(str[1]);
			long c = Long.parseLong(str[2]);
	        if( (a+b) <= c || (a+c)<=b|| (c+b) <=a) {
	        	System.out.println(false);
	        } else {
	        	System.out.println(true);
	        }
		}
	}

}
