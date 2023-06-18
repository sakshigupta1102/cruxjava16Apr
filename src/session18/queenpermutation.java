package session18;

public class queenpermutation {
	public static void main(String[] args) {
		queenperm(new boolean[4], 2, 0, "");
	}
	public static void queenperm(boolean[] board, int tq, int qpsf, String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				queenperm(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf);
				board[i] = false; // backtracking
			}
		}

	}
}
