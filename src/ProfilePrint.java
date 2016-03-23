
public class ProfilePrint {
	byte age;
	String name;
	boolean isMarried;

	public static void main(String[] args) {
		ProfilePrint print = new ProfilePrint();
		byte age = 20;
		String name = "MIN";
		boolean isMarried = true;

		print.setAge(age);
		print.setName(name);
		print.setMarried(isMarried);

		System.out.println(print.getAge());
		System.out.println(print.getName());
		System.out.println(print.isMarried());
	}

	public void setAge(byte paramAge) {
		age = paramAge;
	}

	public byte getAge() {
		return age;
	}

	public void setName(String Paramname) {
		name = Paramname;
	}

	public String getName() {
		return name;
	}

	public void setMarried(boolean Paramflag) {
		isMarried = Paramflag;
	}

	public boolean isMarried() {
		return isMarried;

	}

}
