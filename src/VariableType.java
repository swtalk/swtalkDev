
public class VariableType {
	int instanceVariable;
	static int classVariable;

	public void method(int parameter) {
		int localVariable;
	}

	public int anothermethod(int para) {
		int localVariable = 20;
		return localVariable;

	}

	public static void main(String[] args) {
		VariableType varia = new VariableType();
		System.out.println(varia.anothermethod(30));
	}

}
