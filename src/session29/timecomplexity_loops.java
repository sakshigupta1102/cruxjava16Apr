package session29;

public class timecomplexity_loops {
	public static void main(String[] args) {
		System.out.println("hello");  //O(1)
		System.out.println("hello");  //O(1)
		System.out.println("hello");  //O(1)
		System.out.println("hello");  //O(1)
		System.out.println("hello");  //O(1)
		System.out.println("hello");  //O(1)
		int n=1000;
		int i=1;
		//n
		while(i<n){
			System.out.println(i);
			i++;
		}
		// n^2
		for(i=1;i<= n;i++){
			for(int j=1 ;j <= i;j++ ){
				System.out.println("hey");
			}
		}
		
		//logn base 2
		while (n > 0) {
			System.out.println("Hey");
			n /= 2;
		}
		
		//log n base 2
		i=1;
		while(i<n){
			System.out.println("hey");
			i=i*2;
			
		}
//n
		while(i<= n){
			System.out.println("hey");
			i=i+2;
			i=i+3;
		}
	
		// O(N/k)
		while(i<= n){
			System.out.println("hey");
			i=i+k;
		}
		
		//
		while(i<=n){
			System.out.println("hey");
			i=i*2;
			i=i*3;
		}
		// root N
		for (i = 1; i * i <= n; i++) {
			System.out.println("hey");
		}
		// 1000N^2
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				for (int k = 1; k <= 1000; k++) {
				}
			}
		}

		
	}
}
