package session41;
public class EditDistance {
	public static void main(String[] args) {
		String str1= "horse";
		String str2  = "ros";
//		int[][] strg = new int[str1.length()+1][str2.length()+1];
//		System.out.println(EditDistance(str1, str2, 0, 0, strg));
		System.out.println(EditDistanceBU(str1, str2));
	}
	public static int EditDistanceBU(String str1 , String str2){
		int[][] strg = new int[str1.length()+1][str2.length()+1];
		for(int i=0 ;i<strg.length;i++){
			strg[i][0] = i;
		}
		for(int j=0 ;j<strg[0].length;j++){
			strg[0][j] = j;
		}
		for(int i=1;i<strg.length;i++){
			for(int j=1;j<strg[0].length;j++){
				if(str1.charAt(i-1) == str2.charAt(j-1))
					strg[i][j] = strg[i-1][j-1];
				else{
					int replace = strg[i-1][j-1];
					int delete = strg[i-1][j];
					int insert = strg[i][ j-1];
					strg[i][j] = Math.min(replace, Math.min(delete, insert)) +1;
				}
			}
		}
		for(int[] arr : strg){
			for(int a: arr){
				System.out.print(a+" ");
			}
			System.out.println();
		}
		return strg[strg.length-1][strg[0].length-1];
		
		
	}

	public static int EditDistance(String str1, String str2, int i, int j,
			int[][] strg) {
		if (i == str1.length()) {
			return str2.length() - j;
		}
		if (j == str2.length()) {
			return str1.length() - i;
		}
		if (strg[i][j] != 0) {
			return strg[i][j];
		}
		int ans = 0;
		if (str1.charAt(i) == str2.charAt(j)) {
			ans = EditDistance(str1, str2, i + 1, j + 1, strg);
		} else {
			int replace = EditDistance(str1, str2, i + 1, j + 1, strg);
			int delete = EditDistance(str1, str2, i + 1, j, strg);
			int insert = EditDistance(str1, str2, i, j + 1, strg);
			ans = Math.min(replace, Math.min(delete, insert)) + 1;
		}
		return strg[i][j] = ans;
	}

}
