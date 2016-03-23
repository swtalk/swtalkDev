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
		System.out.println("첫번째 값을 입력하세요");
		flow.first = in.nextInt();
		System.out.println("마지막 값을 입력하세요");
		flow.last = in.nextInt();
		System.out.println(flow.first);
		System.out.println(flow.last);
		System.out.println(flow.forloop(flow.first, flow.last));
		if (flow.first < flow.last) {
			System.out.println("last 가 더큽니다.");
		} else {
			System.out.println("first가 더 큽니다.");
		}
	}

}
