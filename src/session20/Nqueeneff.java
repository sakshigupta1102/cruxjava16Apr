package session20;

public class Nqueeneff {
	public static void main(String[] args) {
		boolean[][] board = new boolean[4][4];
		nqueeneff(board, 0, 0, board.length, "");
	}

	public static void nqueeneff(boolean[][] board, int cr, int qpsf, int tq,
			String ans) {
		if(qpsf == tq){
			System.out.println(ans);
			return;
		}
		if(cr == board.length){
			return;
		}
		for (int col = 0; col < board[0].length; col++) {
			if (isitsafe(board, cr, col)) {
				board[cr][col] = true;
				nqueeneff(board, cr + 1, qpsf + 1, tq, ans + "(" + cr + "-"
						+ col + ")");
				board[cr][col] = false;
			}
		}

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
