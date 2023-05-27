package session12;

import java.util.Scanner;

public class array2dqps {
	public static void display(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + "  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// Scanner scan = new Scanner(System.in);
		// //int[][] arr = new int[4][3];
		// for(int row = 0;row<arr.length;row++){
		// for(int col=0;col<arr[row].length;col++){
		// arr[row][col] = scan.nextInt();
		// }
		// }
		//

		// wave print
		// for (int row = 0; row < arr.length; row++) {
		// if (row % 2 == 0) {
		// for (int col = 0; col < arr[row].length; col++) {
		// System.out.print(arr[row][col] + "  ");
		// }
		// } else {
		// for (int col = arr[row].length - 1; col >= 0; col--) {
		// System.out.print(arr[row][col] + "  ");
		// }
		// }
		// }
		// transpose
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr[0].length; j++) {
				// swap
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		display(arr);

	}
}
