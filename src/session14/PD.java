package session14;

public class PD {
	public static void main(String[] args) {
		PD(5);
		System.out.println("bye");
	}
	public static void PD(int n){
		if(n==0) return; //base case
		System.out.println(n); // self work
		PD(n-1); // smaller problem - recursive call
	}
	
	
}
