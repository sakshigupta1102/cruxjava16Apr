package leetcode;
public class wordsearch {
	public static boolean wordsearch() {
		char[][] board = { { 'X', 'R', 'X', 'X' }, { 'W', 'A', 'R', 'A' },
				{ 'Y', 'M', 'U', 'X' } };
		boolean isvisited[][] = new boolean[board.length][board[0].length];
		String word = "RAMU";
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (word.charAt(0) == board[i][j]) {
					boolean ans = isExist(board, isvisited, i, j,word, 0);
					if (ans)
						return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(wordsearch());
	}
	public static boolean isExist(char[][] board,
			boolean[][] isvisited, int cr, int cc,String word, int idx) {
		if (idx == word.length()) {
			return true;
		}
		if (cr < 0 || cr >= board.length || cc < 0 || cc >= board[0].length
				|| isvisited[cr][cc] == true || board[cr][cc] != word.charAt(idx)) {
			return false;
		}
		
		isvisited[cr][cc] = true;
		boolean left = isExist(board, isvisited, cr, cc - 1, word, idx + 1);
		boolean right = isExist(board, isvisited, cr, cc + 1, word, idx + 1);
		boolean up = isExist(board, isvisited, cr - 1, cc, word, idx + 1);
		boolean down = isExist(board, isvisited, cr + 1, cc, word, idx + 1);
		if (left || right || up || down) {
			return true;
		}

		isvisited[cr][cc] = false;
		return false;
	}
}
