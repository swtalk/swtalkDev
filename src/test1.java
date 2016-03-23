
public class test1 {

	public static void main(String[] args) {
		int i;
		int j;

		for (i = 1; i < 5; i++) {
			for (j = 1; j < 6 - i; j++) {
				System.out.print(" ");
			}

			for (int m = 0; m < i + (i - 1); m++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}

			for (j = 1; j <= 11 - (i * 2); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
