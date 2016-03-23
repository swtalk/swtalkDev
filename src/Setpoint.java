public class Setpoint {

	public void compound() {
		int intValue1 = 10;
		intValue1 += 5;
		System.out.println(intValue1);
		intValue1 -= 5;
		System.out.println(intValue1);
		intValue1 *= 5;
		System.out.println(intValue1);
		intValue1 /= 5;
		System.out.println(intValue1);
		intValue1 %= 5;
		System.out.println(intValue1);

	}

	public static void main(String[] args) {
		Setpoint obj = new Setpoint();
		obj.compound();
	}

}
