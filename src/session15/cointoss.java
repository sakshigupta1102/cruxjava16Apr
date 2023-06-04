package session15;

public class cointoss {
	public static void main(String[] args) {
		int ans = coin(3, "");
		System.out.println(ans);
	}
	public static int coin(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return 1;
		}
		int a=coin(n - 1, ans + "H");
		int b=coin(n - 1, ans + "T");
		return a+b;
	}
}
