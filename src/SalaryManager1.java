
public class SalaryManager1 {

	public static void main(String[] args) {
		SalaryManager1 salaly = new SalaryManager1();
		System.out.println("���� �ݾ�: " + salaly.getMonthlySalary(20000000));
	}

	// �Ѵ� �޿� ��� �޼ҵ�
	public double getMonthlySalary(int yearlySalary) {
		double monthpay = yearlySalary / 12.0;
		System.out.println("�� ���� �޴� �ݾ� " + monthpay);
		double taxfinal = calculateTax(monthpay);
		double nationalPensionfinal = calculateNationalPension(monthpay);
		double HealthInsurancefinal = calculateHealthInsurance(monthpay);
		double finalsum = taxfinal + nationalPensionfinal + HealthInsurancefinal;

		System.out.println("���� ��±ݾ� :" + taxfinal);
		System.out.println("���� ��±ݾ� :" + nationalPensionfinal);
		System.out.println("�Ǻ��� ��±ݾ� :" + HealthInsurancefinal);

		monthpay -= finalsum;
		return monthpay;
	}

	// ���ݸ޼ҵ�
	public double calculateTax(double monthlySalary) {
		double tax = monthlySalary * 0.125;
		return tax;
	}

	// ���ݰ�� �޼ҵ�
	public double calculateNationalPension(double monthlySalary) {
		double nationalPension = monthlySalary * 0.081;
		return nationalPension;

	}

	// �ǰ������ �޼ҵ�
	public double calculateHealthInsurance(double monthlySalary) {
		double healthInsurance = monthlySalary * 0.135;
		return healthInsurance;
	}

}
