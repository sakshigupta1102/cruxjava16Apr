package session5;
public class ques13 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst = 1;
		while (row <= (2 * n - 1)) {
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			if(row<n){
				nst++;
			}else{
				nst--;
			}
			System.out.println();
			row++;
		}

	}

}
