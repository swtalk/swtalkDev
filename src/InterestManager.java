
public class InterestManager {

	public static void main(String[] args) {
		InterestManager manager = new InterestManager();
		
		for (int day =10; day<=370; day+=10){
			double shasha = manager.calculateAmount(day, 1000000);
			System.out.println(day + " "+ shasha);
		}
	}

	public double getInterestRate(int day) {
		double result = 0;
		if (day <= 90) {
			System.out.println("test 90일 이하");
			result = 0.5;
		} else if (day > 90 && day <= 180) {
			System.out.println("test 180일 이하");
			result = 1;
		} else if (day > 180 && day < 365) {
			result = 2;
			System.out.println("test 364일 이하");
		} else {
			System.out.println("test 365일 이상");
			result = 5.6;
		}
		return result;
	}

	public double calculateAmount(int day, long amount) {
		double totalresult;
		double result = getInterestRate(day);
		double resultlast = amount * result / 100.0;
		totalresult = amount + resultlast;
		return totalresult;
	}

}
