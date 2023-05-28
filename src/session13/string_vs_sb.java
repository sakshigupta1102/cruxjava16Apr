package session13;
public class string_vs_sb {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		appendString();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	public static void appendString() {
		int n = 100000;
		String str= "";
		for (int i = 1; i <= n; i++) {
			str+=i;
		}
	}
}
