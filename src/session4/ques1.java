package session4;

public class ques1 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		while (row <= n) {
			int cst = 1;
			while (cst <= n) {
				System.out.print("* ");
				cst = cst + 1;
			}
			System.out.println();
			row = row + 1;
		}

	}
}
