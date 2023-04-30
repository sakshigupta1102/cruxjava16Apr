package session4;

public class ques6 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst = n;
		int nsp = 0;
		while (row <= n) {
			int cst = 1;
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			nst--;
			nsp += 2;
			row++;

		}

	}
}
