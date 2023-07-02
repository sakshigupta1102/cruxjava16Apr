package session21;

public class palpart {
	public static void main(String[] args) {
		printpart("nitin", "");
	}

	public static void printpart(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {
			String str = ques.substring(0, i);
			String ros = ques.substring(i);
			if (ispal(str))
				printpart(ros, ans + str + "|");
		}
	}

	public static boolean ispal(String str) {
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
