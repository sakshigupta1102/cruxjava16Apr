package session4;

public class ques3 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst = n;
		while (row <= n) {
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row++;
			nst--;

		}

	}

}
