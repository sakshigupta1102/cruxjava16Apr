package session11;
import java.util.Scanner;
public class array2ddemo {
	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		Scanner scan = new Scanner(System.in);
		//input
		for(int row = 0; row < arr.length ;row++){
			for(int col=0;col<arr[0].length ; col++){
				arr[row][col] = scan.nextInt();
			}
		}
		//display
//		for(int row=0;row<arr.length;row++){
//			for(int col=0;col<arr[0].length;col++){
//				System.out.print(arr[row][col]+"  ");
//			}
//			System.out.println();
//		}
		//vertical print
		for(int col = 0;col<arr[0].length;col++){
			for(int row=0;row<arr.length;row++){
				System.out.println(arr[row][col]);
			}
		}
		
		

	}
}
