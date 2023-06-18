package session19;

public class ratcheese {
public static void main(String[] args) {
	int[][] board = {{0,1,0,0},{0,0,0,0},{0,1,0,0},{0,1,1,0}};
	boolean[][] isvisited = new boolean[board.length][board[0].length];
	rat_chase(board, 0, 0, "", isvisited);
}
public static void rat_chase(int[][] board, int cr , int cc, String ans, boolean[][] isvisited){
	//+ve base case 
	if(cr == board.length-1 && cc == board[0].length-1){
		System.out.println(ans);
		return;
	}
	//-ve base case
	if(cr < 0 || cr>= board.length || 
			cc <0 || cc>= board[0].length ||board[cr][cc]==1|| 
			isvisited[cr][cc] == true){
		return;
	}	
	isvisited[cr][cc] = true;
	 rat_chase(board, cr+1, cc, ans+"D",isvisited);
	 rat_chase(board, cr, cc+1, ans+"R",isvisited);
	 rat_chase(board, cr-1, cc, ans+"U",isvisited);
	 rat_chase(board, cr, cc-1, ans+"L",isvisited);
	 isvisited[cr][cc] = false;
}
}



