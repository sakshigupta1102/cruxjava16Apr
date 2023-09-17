package session40;

import java.util.Arrays;

public class distinctSubseq {
	public static void main(String[] args) {
		String s = "babgbag";
		String t = "bag";
//		int[][] strg = new int[t.length()][s.length()];
//		for (int i = 0; i < strg.length; i++) {
//			for (int j = 0; j < strg[0].length; j++) {
//				strg[i][j] = -1;
//			}
//		}
//
//		System.out.println(subseq(s, t, 0, 0, strg));
		System.out.println(BU(s, t));
	}

	public static int subseq(String s, String t, int i, int j, int[][] strg) {
		if (i == t.length())
			return 1;
		if (j == s.length())
			return 0;
		if(strg[i][j] != -1){
			return strg[i][j];
		}
		int inc = 0;
		if (s.charAt(j) == t.charAt(i)) {
			inc = subseq(s, t, i + 1, j + 1, strg);
		}
		int exc = subseq(s, t, i, j + 1, strg);
		return  strg[i][j] = inc + exc;
	}
	
	public static int BU(String s , String t){
		int[][] strg = new int[t.length()+1 ][s.length()+1];
		for(int col = 0; col<strg[0].length ;col ++){
			strg[0][col] = 1;
		}
		for(int i=1 ; i<strg.length;i++){
			for(int j= 1 ; j<strg[0].length;j++){
				int inc=0;
				if(s.charAt(j-1) == t.charAt(i-1)){
					inc = strg[i-1][j-1];
				}
				int exc = strg[i][j-1];
				strg[i][j] = inc+exc;
			}
		}
//		for(int[] a : strg){
//			for(int b: a){
//				System.out.print(b+" ");
//			}
//			System.out.println();
//		}
		return strg[strg.length-1][strg[0].length-1];
	}
	
	
	
	
	

}
