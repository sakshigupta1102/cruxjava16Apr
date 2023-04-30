package session4;

public class ques5 {
	public static void main(String[] args) {
		int n = 5;
		int nst = n;
		int nsp = 0;
		int row = 1;
		while (row <= n) {
			int csp = 1;
			int cst = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			nst--;;
			nsp++;
			row++;

		}

	}
}
