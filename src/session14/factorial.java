package session14;

public class factorial {
	public static void main(String[] args) {
		System.out.println("the factorial is" + fact(5));
	}

	public static int fact(int n) {
		if (n == 0)
			return 1;
		return n * fact(n - 1);

	}
}
