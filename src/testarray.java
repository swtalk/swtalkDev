public class testarray {
	int gradeHeights[][];

	public static void main(String[] args) {
		testarray manage = new testarray();
		manage.setData();
		manage.printHeight();

	}

	public void printHeight() {
		// System.out.println("ClassNo " + classNo);
		
		for (int a = 0; a < gradeHeights.length; a++) {
			for (int b = 0; b < gradeHeights[a].length; b++) {
				System.out.println("grade = " + gradeHeights[a][b]);
			}
		}
		// for (int data = 0; data <= gradeHeights.length; data++) {
		// System.out.println(gradeHeights[classNo][data]);
		// }
	}

	public void setData() {
		 gradeHeights = new int[5][];
		 gradeHeights[0] = new int[] { 170, 180, 173, 175, 177 };
		 gradeHeights[1] = new int[] { 160, 165, 167, 186 };
		 gradeHeights[2] = new int[] { 158, 177, 187, 176 };
		 gradeHeights[3] = new int[] { 173, 182, 181 };
		 gradeHeights[4] = new int[] { 170, 180, 165, 177, 172 };
		 }

//		int[][] gradeHeights = new int[5][];
//
//		gradeHeights[0][0] = 170;
//		gradeHeights[0][1] = 170;
//		gradeHeights[0][2] = 173;
//		gradeHeights[0][3] = 177;
//		gradeHeights[0][4] = 177;
//
//		gradeHeights[1][0] = 160;
//		gradeHeights[1][1] = 165;
//		gradeHeights[1][2] = 167;
//		gradeHeights[1][3] = 175;
//		gradeHeights[1][4] = 175;
//
//		gradeHeights[2][0] = 158;
//		gradeHeights[2][1] = 177;
//		gradeHeights[2][2] = 187;
//		gradeHeights[2][3] = 176;
//		gradeHeights[2][4] = 176;
//
//		gradeHeights[3][0] = 173;
//		gradeHeights[3][1] = 182;
//		gradeHeights[3][2] = 181;
//		gradeHeights[3][3] = 181;
//		gradeHeights[3][4] = 181;
//
//		gradeHeights[4][0] = 170;
//		gradeHeights[4][1] = 180;
//		gradeHeights[4][2] = 165;
//		gradeHeights[4][3] = 177;
//		gradeHeights[4][4] = 172;
//	}
	//
}
