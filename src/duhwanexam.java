import java.util.Scanner;

/*
 * author = Park siwoo
 * made = 2015.12.11
 * 각 월급별로 세금을 공제한 금액, 실수령액이 얼마인지 출력하시오
 * 연봉별로~
 * 건강보험은 6.07%
 * 고용보험은 0.65%
 * 국민연금 4.5%
 * 산재보험 0.7%
 * 4개를 뺀 실수령액을 구하고, 각각 얼마가 빠지는지 출력
 * 연봉은 1000~ 5000까지만 
 */

public class duhwanexam {
	double yunbong, choi, suryung, dal;
	double gungang = 6.07;
	double goyong = 0.65;
	double gukmin = 4.5;
	double sanjae = 0.7;

	public String dalsuryung() {
		dal = choi / 12;
		String str = String.format("%.1f", dal);
		return str;
	}

	public double setting() {
		suryung = (yunbong - (yunbong * ((gungang / 100) + (gukmin / 100) + (goyong / 100) + (sanjae / 100))));
		choi = suryung;
		return choi;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		duhwanexam sang = new duhwanexam();
		while (true) {
			System.out.print("연봉 정보를 입력하세요 : ");
			sang.yunbong = in.nextInt();
			int gajimaguk = (int) (sang.yunbong * (sang.gungang / 100) / 12);
			int gajimago = (int) (sang.yunbong * (sang.goyong / 100) / 12);
			int gajimagukmin = (int) (sang.yunbong * (sang.gukmin / 100) / 12);
			int gajimasanjae = (int) (sang.yunbong * (sang.sanjae / 100) / 12);
			if (sang.yunbong <= 1000 || sang.yunbong >= 5000) {
				System.out.println("값을 잘못 입력하셨습니다. 올바른 연봉을 다시 입력해 주세요");
				continue;
			} else {
				System.out.println("귀하의 연봉은 " + sang.yunbong + "만원 입니다");
				System.out.println("이번년도의 국민건강보험 세율은 " + sang.gungang + "이고 국민건강보험에서 (연)-"
						+ (int) (sang.yunbong * (sang.gungang / 100)) + "만원 (월)-" + gajimaguk + "만원이 빠집니다.");
				System.out.println("이번년도의 고용보험 세율은 " + sang.goyong + "이고 고용보험에서 (연)-"
						+ (int) (sang.yunbong * (sang.goyong / 100)) + "만원 (월)-" + gajimago + "만원이 빠집니다.");
				System.out.println("이번년도의 국민연금 세율은 " + sang.gukmin + "이고 국민연금에서 (연)-"
						+ (int) (sang.yunbong * (sang.gukmin / 100)) + "만원 (월)-" + gajimagukmin + "만원이 빠집니다.");
				System.out.println("이번년도의 산재보험 세율은 " + sang.sanjae + "이고 산재보험에서 (연)-"
						+ (int) (sang.yunbong * (sang.sanjae / 100)) + "만원 (월)-" + gajimasanjae + "만원이 빠집니다.");
				System.out.println("귀하의 연봉 실 수령액은 " + (int) sang.setting() + "만원이며, 월별 실 수령액은 입니다." + sang.dalsuryung()
						+ "만원입니다.");
				break;
			}
		}
	}
}