

public class password {
	    public static void main(String[] args) {
	        int passLength = 10; // �н����� ����
	        int passNumber = 20; // ������ �н����� ����
	        int[] password = new int[passLength];
	        for (int i = 0; i < passNumber; i++) {
	            int number = 0;
	            int special = 0;
	            int lower = 0;
	            int upper = 0;
	            for (int j = 0; j < password.length; j++) {
	                int ranNum;
	                ranNum = (int) ((Math.random() * 94) + 33);
	                password[j] = ranNum;
	                if (ranNum < 48) {
	                    special = 1;
	                } else if (ranNum < 58) {
	                    number = 1;
	                } else if (ranNum < 65) {
	                    special = 1;
	                } else if (ranNum < 91) {
	                    upper = 1;
	                } else if (ranNum < 97) {
	                    special = 1;
	                } else if (ranNum < 123) {
	                    lower = 1;
	                } else {
	                    special = 1;
	                }
	            }
	            if (number + special + lower + upper >= 3) {
	                for (int n : password) {
	                    System.out.print((char) n);
	                }
	                System.out.println();
	            } else {
	                i--;
	            }
	        }
	    }
	}
