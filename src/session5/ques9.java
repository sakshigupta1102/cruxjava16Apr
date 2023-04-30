package session5;

public class ques9 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst = 1;
		int nsp = n-1;
		while (row <= n) {
			int num=row;
			int cst = 1;
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
			while (cst <= nst) {
				if(cst==1 || cst==nst){
					System.out.print(row+" ");
				}
				else{
					System.out.print(0+" ");
				}
				cst++;
			}
			System.out.println();
			nst=nst+2;
			nsp--;
			row++;

		}

	}
}
