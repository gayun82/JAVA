package co.edu.reference;

public class reference {

	public static void main(String[] args) {
		int[] ary1 = { 1, 2, 3 };
		System.out.println(ary1);

		String a = "자바";
		String b = "자바";
		if (a == b) {// 주소 비교
			System.out.println("a");
		}
		if (a.equals(b)) {
			System.out.println("b");
		}
	}
}
