
public class iftest {

	public void ifStatement2() {
		int valuekey = 10;
		if (valuekey >= 5)
			System.out.println("valuekey 5more than");
		else
			System.out.println("valuekey 5 bottom");
	}

	public void ifStatement() {
		if (true)
			System.out.println("It's True");
		if (false)
			System.out.println("It's False");
	}

	public static void main(String[] args) {
		iftest test = new iftest();
		test.ifStatement();
		test.ifStatement2();

	}

}
