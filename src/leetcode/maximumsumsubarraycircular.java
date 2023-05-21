package leetcode;

class maximumsumsubarraycircular {
	public int maxSubarraySumCircular(int[] arr) {
		int kad = kad(arr);
		int sum = sum(arr);
		reversesign(arr);
		int revkad = kad(arr);
		int a = revkad + sum;
		if (a == 0)
			return kad;
		return Math.max(a, kad);
	}

	public int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public void reversesign(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -arr[i];
		}
	}

	public int kad(int[] arr) {
		int maxsum = Integer.MIN_VALUE;
		int currsum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (currsum < 0)
				currsum = 0;
			currsum += arr[i];
			maxsum = Math.max(currsum, maxsum);
		}
		return maxsum;
	}

}

