package session14;
public class PI {
	public static void main(String[] args) {
		PI(5);
	}

	public static void PI(int n) {
		if (n == 0)
			return;
		PI(n - 1);
		System.out.println(n);

	}
}
