package subpackage;

public class Child extends Parent {
	public Child() {
		System.out.println("Child Constructor");
	}

	public Child(String name) {
	}

	public void printAge() {
		System.out.println("printAge - ()18 month ");
	}

	@Override
	public void printName() {
		System.out.println("printNAme () - Child ");
	}
}
