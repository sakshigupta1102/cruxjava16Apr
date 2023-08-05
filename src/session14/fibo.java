package session14;

public class fibo {
public static void main(String[] args) {
	System.out.println(fibo(6));
}
public static int fibo(int n){
	if(n==0) return 0;
	if(n==1) return 1;
	int sp1 = fibo(n-1); //5
	int sp2 = fibo(n-2) ;//3
	return sp1+sp2;
}
}
 

