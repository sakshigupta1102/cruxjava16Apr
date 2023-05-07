package session6;
public class pascaltraingle {
	public static void main(String[] args) {
		int n = 5;
		int row = 0;
		int nst = 0;
		while (row < n) {
			int cst = 0;
			int ncr = 1;
			while (cst <= nst) {
				System.out.print(ncr + " ");
				ncr = (ncr*(row - cst)) / (cst + 1);
				cst++;
			}
			System.out.println();
			row++;
			nst++;
		}
	}
}
