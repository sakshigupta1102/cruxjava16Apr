package session15;

public class climbstairs {
	public static void main(String[] args) {
		climbchintu(0, 5, "");
	}

	public static void climbchintu(int curr, int end, String ans) {
		//+ve base case
		if (curr == end) {
			System.out.println(ans);
			return;
		}
		//-ve base case
		if (curr > end) {
			return;
		}
		climbchintu(curr + 1, end, ans + "1");
		climbchintu(curr + 2, end, ans + "2");
		climbchintu(curr + 3, end, ans + "3");

	}
}
