package session37;

public class demo2 {
	static int a=10;
	int b= 5;
	public demo2(){
		this.a++;
		this.b++;
	}
	public  static void change(){
		a = 12;
	}
	public static void hey(){
		System.out.println("hey i am static ");
	}
	public void nonstatic_hey(){
		System.out.println("i am not static ");
	}
	
}
