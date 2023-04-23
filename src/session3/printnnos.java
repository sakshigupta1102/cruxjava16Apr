package session3;
import java.util.Scanner;
public class printnnos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int i=1; // initialization
		int sum=0;
		while(i<=n){
		   sum = sum + i;
			i+=1; // increment
		}
		System.out.println(sum);
//		System.out.println("******************");
//		i=n;
//		while(i>0){
//			System.out.print(i+"  ");
//			i-=1;
//		}
//		

	}
}




