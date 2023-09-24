package session42;

public interface runnable {
 
	int a= 10;
	void run();
	int havefun();
	default void def_fun(){
		System.out.println("i am default function");
	}
	static void static_func(){
		System.out.println("i am static func");
	}
}
