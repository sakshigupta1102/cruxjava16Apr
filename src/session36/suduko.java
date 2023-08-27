package session36;

public class suduko {
	public static void main(String[] args) {
		String str = "00006010000700430520500080910"
				+ "90700030004000870000260040203000" + "90830000750001708030";
		int[][] board = new int[9][9];
		int idx = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				board[i][j] = str.charAt(idx) - '0';
				idx++;
			}
		}
		display(board);
		System.out.println("********************");
		suduko(board, 0, 0);
	}
	public static void display(int[][] arr) {
		for (int[] is : arr) {
			for (int i : is) {
				System.out.print(i + " ");
			}

			System.out.println();
		}
	}

	public static void suduko(int[][] board, int cr, int cc) {
		
		if (cc == board.length) {
			cr = cr + 1;
			cc = 0;
		}
		if (cr == board.length) {
			display(board);
			return;
		}
		
		if (board[cr][cc] != 0) {
			suduko(board, cr, cc + 1);
			return;
		}
		for (int d = 1; d <= 9; d++) {
			if (isItSafe(board, d, cr, cc)) {
				board[cr][cc] = d; // place
				suduko(board, cr, cc + 1); // recursion
				board[cr][cc] = 0; // undo
			}
		}

	}

	public static boolean isItSafe(int[][] board, int d, int cr, int cc) {
		// check in col
		for (int row = 0; row < 9; row++) {
			if (board[row][cc] == d)
				return false;
		}
		// check in row
		for (int col = 0; col < 9; col++) {
			if (board[cr][col] == d) {
				return false;
			}
		}
		// check in grid
		int sr = cr - (cr % 3);
		int sc = cc - (cc % 3);
		for (int i = sr; i < sr + 3; i++) {
			for (int j = sc; j < sc + 3; j++) {
				if (board[i][j] == d)
					return false;
			}
		}
		return true;

	}
}
