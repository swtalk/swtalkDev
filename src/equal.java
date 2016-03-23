public class equal {
	public static void main(String[] args) {

		String sName = "뉴시우";

		String sName1 = new String("뉴시우");
		String sName2 = new String("뉴시우");
//////////////////////////////////////////////
		if (sName1 == sName2) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
//////////////////////////////////////////////
//////////////////////////////////////////////
		if (sName1.equals(sName2)) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
//////////////////////////////////////////////
	}
}
