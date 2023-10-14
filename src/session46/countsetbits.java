package session46;
public class countsetbits {
public static void main(String[] args) {
	int n= 42;
	int cnt=0;
	while(n>0){
		int bit = n&1;
		if(bit == 1) cnt++;
		n = n>>1;
	}
	System.out.println(cnt);
}
}
