package session41;

public class LCS {
	public static void main(String[] args) {
System.out.println(LCS("abcde", "ace", 0, 0));
System.out.println(LCS_BU("ABCDE", "ACED"));
	}
	public static int LCS(String str1, String str2, int i, int j) {
		if(str1.length() == i || str2.length() == j){
			return 0;
		}
		int ans=0;
		if(str1.charAt(i) == str2.charAt(j)){
			ans = 1+ LCS(str1, str2, i+1, j+1);
		}else{
			int takefrom1 = LCS(str1, str2, i+1, j);
			int takefrom2 = LCS(str1, str2, i, j+1);
			ans = Math.max(takefrom1, takefrom2);
		}
		return ans;

	}
	
	public static int LCS_BU(String str1 , String str2){	
		int[][] strg = new int[str1.length()+1][str2.length()+1];
		for(int i=1;i<strg.length;i++){
			for(int j= 1 ; j<strg[0].length;j++){
				if(str1.charAt(i-1) == str2.charAt(j-1))
					strg[i][j] = 1 + strg[i-1][j-1];
				else{
					int takefrom1 = strg[i-1][j];
					int takefrom2 = strg[i][j-1];
					strg[i][j] = Math.max(takefrom1, takefrom2);
				}			
			}
		}
		return strg[strg.length-1][strg[0].length-1];
		
	}
	
	
	
}



