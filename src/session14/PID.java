package session14;
public class PID {
public static void main(String[] args) {
	PID(5);
}
public static void PID(int n){
	if(n==0 ) return;
	System.out.println("hello " + n);
	PID(n-1);
	System.out.println("bye " + n);	
}
}
