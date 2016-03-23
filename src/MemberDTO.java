public class MemberDTO {
	public String name ;
	public int phone;
	public String email;

	public MemberDTO(String name) {
		this.name = name;
	}

	public static void staticMethod() {
		System.out.println("This is a static method");
//		System.out.println(name);
	}
}
