package co.yedam.var;

public class VariableExample2 {

	public static void main(String[] args) {
		
		/*
		 * byte a = 10; int b = a; long c = b;
		 * 
		 * byte d = 10; char f = d;
		 */
		
		int intVanlue = 44032;
		char charValue = (char) intVanlue;
		System.out.println(charValue);
		
		int intValue1 = 10;
		byte byteValue = (byte)intValue1;
		
		System.out.println(byteValue);
	}

}
