/*
 * author = Park siwoo
 * date = 2015.12.11
 */

public class Operator {
	public static void main(String[] args) {
		Operator obj = new Operator();
		obj.mulitplicative();

	}

	public void mulitplicative() {
		int value1 = 10;
		int value2 = 5;
		int result = value1 / value2;
		float result1 = (float) value2 / value1;
		System.out.println(result);
		System.out.println(result1);
	}
}
