public class equal {
	public static void main(String[] args) {

		String sName = "���ÿ�";

		String sName1 = new String("���ÿ�");
		String sName2 = new String("���ÿ�");
//////////////////////////////////////////////
		if (sName1 == sName2) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ�");
		}
//////////////////////////////////////////////
//////////////////////////////////////////////
		if (sName1.equals(sName2)) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ�");
		}
//////////////////////////////////////////////
	}
}
