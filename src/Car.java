
public class Car {
	int speed = 50;
	int distance = 10;
	String color = "Red";

	public void speedUp() {
		speed = speed + 5;
	}

	public void speedDown() {
		speed = speed - 5;
	}

	public int getCurrentspeed() {
		return speed;
	}

	public static void main(String[] args) {
		Car Dogcar = new Car();
		Car Catcar = new Car();

		Dogcar.speedUp();
		Dogcar.speedUp();
		Catcar.speedDown();
		System.out.println("Dogcar의 현재속도 " + Dogcar.getCurrentspeed());
		System.out.println(Catcar.getCurrentspeed());
	}

}


