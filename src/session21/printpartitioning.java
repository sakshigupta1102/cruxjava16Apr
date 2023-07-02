package session21;

public class printpartitioning {
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
			printpart(ros, ans + str + "|");
		}
	}
}
