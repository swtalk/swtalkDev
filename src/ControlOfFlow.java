import java.util.Scanner;

public class ControlOfFlow {
	int first;
	int last;
	int start;
	int sum;

	public int forloop(int first, int last) {

		return sum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ControlOfFlow flow = new ControlOfFlow();
		System.out.println("ù��° ���� �Է��ϼ���");
		flow.first = in.nextInt();
		System.out.println("������ ���� �Է��ϼ���");
		flow.last = in.nextInt();
		System.out.println(flow.first);
		System.out.println(flow.last);
		System.out.println(flow.forloop(flow.first, flow.last));
		if (flow.first < flow.last) {
			System.out.println("last �� ��Ů�ϴ�.");
		} else {
			System.out.println("first�� �� Ů�ϴ�.");
		}
	}

}
