class LimitedValue {
	final static int Upper_linit = 100000;
	int value;

	void setValue(int value) {
		if (value < Upper_linit) {
			this.value = value;
		} else
			this.value = Upper_linit;
	}
}

class jbbabo {
	static String ddd = "�ٺ�������";

	void babo() {
		System.out.println("�ٺ�������");
	}
}

public class tatic {
	public static void main(String[] args) {
		LimitedValue val = new LimitedValue();
		jbbabo v = new jbbabo();
		val.setValue(200000);
		// System.out.println("val.value = " + val.value);

		// System.out.println("���Ѱ� " + LimitedValue.Upper_linit);
		System.out.println(v.ddd);
		System.out.println(jbbabo.ddd);
		// v.babo();
	}
}
