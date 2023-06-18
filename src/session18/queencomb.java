package session18;
public class queencomb {
	public static void main(String[] args) {
		queencomb(new boolean[4], 2, 0, "",0);
	}
	public static void queencomb(boolean[] board, int tq, int qpsf, String ans,int lastplaced) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		for (int i = lastplaced; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				queencomb(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf,i+1);
				board[i] = false; // backtracking
			}
		}

	}
}
