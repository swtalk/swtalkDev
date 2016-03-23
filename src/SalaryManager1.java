
public class SalaryManager1 {

	public static void main(String[] args) {
		SalaryManager1 salaly = new SalaryManager1();
		System.out.println("실제 금액: " + salaly.getMonthlySalary(20000000));
	}

	// 한달 급여 계산 메소드
	public double getMonthlySalary(int yearlySalary) {
		double monthpay = yearlySalary / 12.0;
		System.out.println("월 실제 받는 금액 " + monthpay);
		double taxfinal = calculateTax(monthpay);
		double nationalPensionfinal = calculateNationalPension(monthpay);
		double HealthInsurancefinal = calculateHealthInsurance(monthpay);
		double finalsum = taxfinal + nationalPensionfinal + HealthInsurancefinal;

		System.out.println("세금 띄는금액 :" + taxfinal);
		System.out.println("연금 띄는금액 :" + nationalPensionfinal);
		System.out.println("건보료 띄는금액 :" + HealthInsurancefinal);

		monthpay -= finalsum;
		return monthpay;
	}

	// 세금메소드
	public double calculateTax(double monthlySalary) {
		double tax = monthlySalary * 0.125;
		return tax;
	}

	// 연금계산 메소드
	public double calculateNationalPension(double monthlySalary) {
		double nationalPension = monthlySalary * 0.081;
		return nationalPension;

	}

	// 건강보험료 메소드
	public double calculateHealthInsurance(double monthlySalary) {
		double healthInsurance = monthlySalary * 0.135;
		return healthInsurance;
	}

}
