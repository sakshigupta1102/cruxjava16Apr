package session19;

import java.util.ArrayList;

public class subset2 {
	public static void main(String[] args) {
		int[] arr = { 1, 1,2 };
		ArrayList<ArrayList<Integer>> fans = new ArrayList();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		subset2(arr, ans,0, fans,true);
		System.out.println(fans);
	}
	public static void subset2(int[] arr, ArrayList<Integer> small, int vidx,
			ArrayList<ArrayList<Integer>> big, boolean lastcall) {
		if (vidx == arr.length) {
			ArrayList<Integer> copy = new ArrayList<Integer>(small);
			big.add(copy);
			return;
		}
		if (lastcall == false && arr[vidx] == arr[vidx - 1]) {
			subset2(arr, small, vidx+1, big, false);
		} else {
			small.add(arr[vidx]);
			subset2(arr, small, vidx + 1, big, true); // include
			small.remove(small.size() - 1);
			subset2(arr, small, vidx + 1, big, false); // exclude
		}
	}
}
