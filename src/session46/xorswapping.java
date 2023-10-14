package session46;

public class xorswapping {
public static void main(String[] args) {
	int a= 5;
	int b = 7;
	System.out.println(a+" "+b);
	a = a^b; // 5^ 7
	b= a^b; // 5 ^ 7 ^ 7
	a= a^b; // 5 ^ 7 ^ 5
	System.out.println(a+" "+ b);
}
}
