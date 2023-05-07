package session7;
public class functiondemo {
	public static void main(String[] args) {
		System.out.println("hello");
		int a = 10;
		System.out.println(a);
		int s = sum();
		System.out.println(s);
		System.out.println("bye");
	}
	public static   int  sum() {
		int a = 10;
		int b = 20;
		//sub();
		return a+b;
	}

	public static void sub() {
		int a = 90;
		int b = 100;
		System.out.println("sub is" + (a - b));
	}
}
