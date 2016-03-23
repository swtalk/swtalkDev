
public class ManageStudent {

	public student[] addStudent() {
		student[] student = new student[3];
		student[0] = new student("Lim");
		student[1] = new student("Min");
		student[2] = new student("Sook", "seoul", "010xxxxxx", "ask@godofjava.com");
		return student;
	}

	public void printStudents(student[] student) {
		for (student data : student) {
			System.out.println(data);
		}
	}

	public static void main(String[] args) {
		student[] student = null;
		ManageStudent mst = new ManageStudent();
		student = mst.addStudent();
		mst.printStudents(student);
	}
}
