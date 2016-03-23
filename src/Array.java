
public class Array {

	static String[] month = { "Janu", "Febr", "March", "April", "May" };

	public static void main(String[] args) {
		Array array = new Array();
//		array.printArrayLength();
//		if (args.length>0){
//			for (String arg:args){
//				System.out.println(arg);
//			}
//		}
	}

	public void printArrayLength() {
		int monthLength = month.length;
		System.out.println("length = " + monthLength);
		for (String tempvariable : month) {
			System.out.println("temp = " + tempvariable);
		}
		for (int mas = 0; mas < month.length; mas++) {
			System.out.println("월별 개수 " + month[mas]);

		}
		int[][] twoDim = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, } };
		int lenthmax = twoDim.length;
		System.out.println("TwoDim.length = " + twoDim.length);
		System.out.println("TwoDim[0] = " + twoDim[0].length);
		int twodimlen = twoDim[0].length;
		System.out.println(twodimlen);

		for (int loop1 = 0; loop1 < lenthmax; loop1++) {
			int lenthmax1 = twoDim[loop1].length;
			for (int loop2 = 0; loop2 < lenthmax1; loop2++) {
				System.out.print(twoDim[loop1][loop2]);
			}
		}
	}

}
