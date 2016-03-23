
public class ReferenceType {
	public void print(int data) {

	}

	public void print(String data) {

	}

	public void print(int intData, String stringData) {

	}

	public void print(String stringData, int intdata) {

	}

	public void callPassByValue() {
		int a = 10;
		String b = "b";
		MemberDTO dto = new MemberDTO("sanbmin");
		passByValue(a, b, dto);
		System.out.println("CallpassByValue Method result !");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("dto.name = " + dto.name);
	}

	public void passByValue(int a, String b, MemberDTO dto) {
		a = 20;
		b = "z";
		// dto = new MemberDTO("Newsiwoo");
		dto.name = "Sunghoon";
		System.out.println("PassByValue method Result!!");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("dto.name = " + dto.name);
	}

	public int intReturn() {
		int intReturn = 0;
		return intReturn;
	}

	public int[] intArrayReturn() {
		int intArray[] = new int[10];
		return intArray;
	}

	public String stringReturn() {
		String str = "Return value";
		return str;
	}

	public void checkMemberDTOname() {
		MemberDTO dto1 = new MemberDTO("Sangmin");
		System.out.println(dto1.name);
		System.out.println(dto1.name);

	}

	public void calculateNumbers(int... numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		System.out.println("Total =" + total);

	}

	public void makeStaticBlockObject() {
		System.out.println("data = " + StaticBlock.getData());
		System.out.println("checking block1");
		StaticBlock block1 = new StaticBlock();
		System.out.println("data = " + StaticBlock.getData());
		System.out.println("created block1");
		System.out.println("creating block2");
		StaticBlock block2 = new StaticBlock();
		System.out.println("data = " + StaticBlock.getData());
		System.out.println("Created block2");

	}

	public static void main(String[] args) {
		ReferenceType reference = new ReferenceType();
		// System.out.println(reference.stringReturn());
		// MemberDTO.staticMethod();
		// reference.checkMemberDTOname();
		// reference.makeStaticBlockObject();
		reference.callPassByValue();
		reference.calculateNumbers(1, 2, 3, 4, 5);
		reference.calculateNumbers(1, 2, 3, 4, 5);
		reference.calculateNumbers(1, 2, 3, 4, 5);
	}
}
