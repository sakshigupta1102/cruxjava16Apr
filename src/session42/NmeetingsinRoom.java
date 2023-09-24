package session42;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class NmeetingsinRoom {
	public static void main(String[] args) {
		int[] start = { 1, 8, 5, 0, 3, 5 };
		int[] end = { 2, 9, 7, 5, 4, 9 };
		List<pair> list = new ArrayList();
		for (int i = 0; i < start.length; i++) {
			list.add(new pair(start[i], end[i]));
		}
		Collections.sort(list, new PairComp());
		int ans = 1;
		int lastmeet = list.get(0).end;
		for (int i = 1; i < list.size(); i++) {
			pair currpair = list.get(i);
			if (currpair.start > lastmeet) {
				ans++;
				lastmeet = currpair.end;
			}
		}
		System.out.println(ans);

	}
}
class pair {
	int start;
	int end;
	public pair(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public String toString() {
		return "pair [start=" + start + ", end=" + end + "]";
	}

}

class PairComp implements Comparator<pair> {
	@Override
	public int compare(pair o1, pair o2) {
		if (o1.end < o2.end)
			return -1;
		else if (o1.end > o2.end)
			return 1;
		else if (o1.start < o2.start)
			return -1;
		return 1;
	}
}
