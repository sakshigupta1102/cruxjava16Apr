package session20;
public class Nqueen {
	public static void main(String[] args) {
		boolean[][] board = new boolean[4][4];
		nQueen(board, 0, 0, 0, board.length, "");
	}
	public static void nQueen(boolean[][] board, int cr, int cc, int qpsf,
			int tq, String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		if (cc == board[0].length) {
			cr = cr + 1;
			cc = 0;
		}
		if (cr == board.length) {
			return;
		}

		if (isitsafe(board, cr, cc)) {
			board[cr][cc] = true;
			nQueen(board, cr, cc + 1, qpsf + 1, tq, ans + "( " + cr + "-" + cc
					+ ")"); // place
			board[cr][cc] = false;
		}
		nQueen(board, cr, cc + 1, qpsf, tq, ans); // not place
	}

	public static boolean isitsafe(boolean[][] board, int cr, int cc) {
		// upward
		int row = cr - 1;
		while (row >= 0) {
			if (board[row][cc])
				return false;
			row--;
		}
		// left
		int col = cc - 1;
		while (col >= 0) {
			if (board[cr][col])
				return false;
			col--;
		}
		// dia left
		row = cr - 1;
		col = cc - 1;
		while (row >= 0 && col >= 0) {
			if (board[row][col])
				return false;
			col--;
			row--;
		}
		// dia right
		row = cr - 1;
		col = cc + 1;
		while (row >= 0 && col < board[0].length) {
			if (board[row][col])
				return false;
			col++;
			row--;
		}
		return true;

	}
}
