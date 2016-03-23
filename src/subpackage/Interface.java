package subpackage;

public class Interface {

	public Interface() {
	}

	public static void main(String[] args) {
		Child child = new Child();
		child.printName();
		callPrintNames();
	}

	public static void callPrintNames() {
		Parent parent1 = new Parent();
		Parent parent2 = new Child();
		Parent parent3 = new ChildOther();

		parent1.printName();
		parent2.printName();
		parent3.printName();
	}

	public void objectCast() {
		Parent parent = new Parent();
		Child child = new Child();

		Parent parent2 = child;
		Child child2 = (Child) parent;
	}

	public void objectCast2() {
		Parent[] parentArray = new Parent[3];
		parentArray[0] = new Child();
		parentArray[1] = new Parent();
		parentArray[2] = new Child();

		for (Parent tempParent : parentArray) {
			if (tempParent instanceof Child) {
				System.out.println("child");
				Child tempchild = (Child) tempParent;

			} else {
				System.out.println("Parent");
			}
		}
	}
}
