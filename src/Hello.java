public class Hello {

	public static void main(String[] args) {
		int i, j; //돌릴변수

		for (i = 1; i <= 5; i++) {// i값을 1부터 증가시켜 1에 멈춘상태 >> j 는 0상태 = i보다 j가 작으므로 하나찍고 패스
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (i = 4; i > 0; i--) {// 반대로 돌아옴
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}