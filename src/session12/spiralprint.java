package session12;

public class spiralprint {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 1, 2, 3, 4 } };
		int cnt = 1;
		int total = arr.length * arr[0].length;
		int minrow = 0;
		int maxrow = arr.length - 1;
		int mincol = 0;
		int maxcol = arr[0].length - 1;
		while (cnt <= total) {
			for (int col = mincol; col <= maxcol && cnt <= total; col++) {
				System.out.print(arr[minrow][col] + "  ");
				cnt++;
			}
			minrow++;
			for (int row = minrow; row <= maxrow && cnt <= total; row++) {
				System.out.print(arr[row][maxcol] + "  ");
				cnt++;
			}
			maxcol--;
			for (int col = maxcol; col >= mincol && cnt <= total; col--) {
				System.out.print(arr[maxrow][col] + "  ");
				cnt++;
			}
			maxrow--;
			for (int row = maxrow; row >= minrow && cnt <= total; row--) {
				System.out.print(arr[row][mincol] + "  ");
				cnt++;
			}

		}

	}

}
