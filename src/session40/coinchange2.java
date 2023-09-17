package session40;

public class coinchange2 {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 2 };
		int[][] strg = new int[5 + 1][arr.length + 1];
		int ans = coinchange2(arr, 5, 0, strg);
		System.out.println(ans);
	}

	public static int coinchange2(int[] arr, int amt, int i, int[][] strg) {
		if (amt == 0)
			return 1;
		if (i >= arr.length)
			return 0;
		if (strg[amt][i] != 0) {
			return strg[amt][i];
		}
		int inc = 0;
		int exc = 0;
		if (amt >= arr[i]) {
			inc = coinchange2(arr, amt - arr[i], i, strg);
		}
		exc = coinchange2(arr, amt, i + 1, strg);
		return strg[amt][i] = inc + exc;

	}

	public static int CoinChangesBU(int[] arr, int amount) {
		int[][] strg = new int[amount + 1][arr.length + 1];
		for (int col = 0; col < strg[0].length; col++) {
			strg[0][col] = 1;
		}
		for (int amt = 1; amt < strg.length; amt++) {
			for (int idx = 1; idx < strg[0].length; idx++) {
				int inc = 0;
				if (amt >= arr[idx - 1]) {
					inc = strg[amt - arr[idx - 1]][idx];
				}
				int dnt_inc = strg[amt][idx - 1];
				strg[amt][idx] = inc + dnt_inc;
			}
		}
		return strg[strg.length - 1][strg[0].length - 1];

	}

}
