package session5;
public class ques14 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst = 1;
		int nsp= n-1;
		while (row <= (2 * n - 1)) {
			int cst = 1;
			int csp=1;
			while(csp<=nsp){
				System.out.print("  ");
				csp++;
			}
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			if(row<n){
				nst++;
				nsp--;
			}else{
				nst--;
				nsp++;
			}
			System.out.println();
			row++;
		}

	}

}
