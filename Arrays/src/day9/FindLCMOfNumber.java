package day9;

public class FindLCMOfNumber {

	public static void main(String[] args) {
		int n= 48, m=72;
		int lcm = m>n?m:n;
		int i=1;
		while(true) {
			
			if((lcm*i)%n==0 && (lcm*i)%m==0) {
				System.out.println(lcm*i);
				return ;
			}
			i++;
		}

	}

}
