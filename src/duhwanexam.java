import java.util.Scanner;

/*
 * author = Park siwoo
 * made = 2015.12.11
 * �� ���޺��� ������ ������ �ݾ�, �Ǽ��ɾ��� ������ ����Ͻÿ�
 * ��������~
 * �ǰ������� 6.07%
 * ��뺸���� 0.65%
 * ���ο��� 4.5%
 * ���纸�� 0.7%
 * 4���� �� �Ǽ��ɾ��� ���ϰ�, ���� �󸶰� �������� ���
 * ������ 1000~ 5000������ 
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
			System.out.print("���� ������ �Է��ϼ��� : ");
			sang.yunbong = in.nextInt();
			int gajimaguk = (int) (sang.yunbong * (sang.gungang / 100) / 12);
			int gajimago = (int) (sang.yunbong * (sang.goyong / 100) / 12);
			int gajimagukmin = (int) (sang.yunbong * (sang.gukmin / 100) / 12);
			int gajimasanjae = (int) (sang.yunbong * (sang.sanjae / 100) / 12);
			if (sang.yunbong <= 1000 || sang.yunbong >= 5000) {
				System.out.println("���� �߸� �Է��ϼ̽��ϴ�. �ùٸ� ������ �ٽ� �Է��� �ּ���");
				continue;
			} else {
				System.out.println("������ ������ " + sang.yunbong + "���� �Դϴ�");
				System.out.println("�̹��⵵�� ���ΰǰ����� ������ " + sang.gungang + "�̰� ���ΰǰ����迡�� (��)-"
						+ (int) (sang.yunbong * (sang.gungang / 100)) + "���� (��)-" + gajimaguk + "������ �����ϴ�.");
				System.out.println("�̹��⵵�� ��뺸�� ������ " + sang.goyong + "�̰� ��뺸�迡�� (��)-"
						+ (int) (sang.yunbong * (sang.goyong / 100)) + "���� (��)-" + gajimago + "������ �����ϴ�.");
				System.out.println("�̹��⵵�� ���ο��� ������ " + sang.gukmin + "�̰� ���ο��ݿ��� (��)-"
						+ (int) (sang.yunbong * (sang.gukmin / 100)) + "���� (��)-" + gajimagukmin + "������ �����ϴ�.");
				System.out.println("�̹��⵵�� ���纸�� ������ " + sang.sanjae + "�̰� ���纸�迡�� (��)-"
						+ (int) (sang.yunbong * (sang.sanjae / 100)) + "���� (��)-" + gajimasanjae + "������ �����ϴ�.");
				System.out.println("������ ���� �� ���ɾ��� " + (int) sang.setting() + "�����̸�, ���� �� ���ɾ��� �Դϴ�." + sang.dalsuryung()
						+ "�����Դϴ�.");
				break;
			}
		}
	}
}