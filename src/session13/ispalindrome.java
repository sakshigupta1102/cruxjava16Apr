package session13;

public class ispalindrome {
	public static void main(String[] args) {
		String str = "NITTIN";
		System.out.println(ispalindrome(str));
	}

	public static String reverse(String str) {
		String ans = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			ans += str.charAt(i);
		}
		return ans;

	}

	public static boolean ispalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(j);
			if (ch1 != ch2)
				return false;
			i++;
			j--;
		}
		return true;

	}
}
