class Sub {
	int pw;
	String id;

	public void getInfo(int pw) {
		this.pw = pw;
		System.out.println("��й�ȣ = " + pw);
	}

	public void getInfo(int pw, String id) {
		this.pw = pw;
		this.id = id;
		System.out.println("��й�ȣ = " + pw + "  id =" + id);
	}
}

public class over {

	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.getInfo(1234);
		sub.getInfo(1234, "swtalk");
	}

}
