

public class ManageHeight1 {

	public static void main(String[] args) {
		ManageHeight1 manage = new ManageHeight1();
		manage.setData();
//		manage.printheight(0);
		manage.printAverage(1);
	}

	int gradeHeights[][] = { { 170, 180, 173, 175, 177 }, { 160, 165, 167, 186 }, { 158, 177, 187, 176 },
			{ 173, 182, 181 }, { 170, 180, 165, 177, 172 } };

	public void setData() {
	}

	public void printheight(int classNo) {

		for (int loop1; classNo < gradeHeights.length; classNo++) {
			int max1 = gradeHeights[classNo].length;
			System.out.println("Class No. " + (classNo + 1));
			for (int loop2 = 0; loop2 < max1; loop2++) {
				System.out.println("gradeHeight = " + gradeHeights[classNo][loop2]);
			}
		}

	}

	public void printAverage(int classNo) {
		System.out.println("ClassNo . " + classNo);
		double sum = 0;
		for (int avgmax = 0; avgmax < gradeHeights.length; avgmax++) {
			int leng = gradeHeights[avgmax].length;
			for (int avgmax1 = 0; avgmax1 < leng; avgmax1++) {
				sum += gradeHeights[avgmax][avgmax1];
				System.out.println(sum / leng);
			}
			classNo++;
		}

	}
}