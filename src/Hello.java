public class Hello {

	public static void main(String[] args) {
		int i, j; //��������

		for (i = 1; i <= 5; i++) {// i���� 1���� �������� 1�� ������� >> j �� 0���� = i���� j�� �����Ƿ� �ϳ���� �н�
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (i = 4; i > 0; i--) {// �ݴ�� ���ƿ�
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}