package day18;

import java.util.Arrays;
import java.util.List;

public class PairTravelTree {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(1,2,3,4,5, 6, 7,8, 9, 10);
		//Number divide by 2
		numberList.stream().filter(num -> num%2==0).forEach(System.out ::println);
		//Number divide by 3
		numberList.stream().filter(num -> num%3==0).forEach(System.out ::println);

	}

}
