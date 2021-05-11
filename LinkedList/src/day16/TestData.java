package day16;

public class TestData {

	public static void main(String[] args) {
		String strURL= "dev-lobby-fb-umx-5427.lobby101.set.iconf.net";
		String strContext= "https://dev-lobby-fb-umx-5427.lobby101.set.iconf.net/gcc/meet.do?room=gxjb5f";
		if (strContext.contains(strURL)) {
			System.out.println("Contains");
		} else {
			System.out.println("Not Contains");
		}
	}

}
