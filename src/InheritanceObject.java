
public class InheritanceObject {

	public static void main(String[] args) {
		InheritanceObject obj = new InheritanceObject();
		obj.toStringMethod(obj);
		obj.toStringMethod2(obj);
	}

	public void toStringMethod(InheritanceObject obj) {
		System.out.println(obj);
		System.out.println(obj.toString());
		System.out.println("plus " + obj);
	}

	public void toStringMethod2(InheritanceObject obj) {
		System.out.println(this);
		System.out.println(toString());
		System.out.println("plus " + this);
	}
}
