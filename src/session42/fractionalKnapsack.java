package session42;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class fractionalKnapsack {
	public static void main(String[] args) {
		int[] profit = {15,14,10,45,36};
		int[] wt = {2,5,1,3,4};
		float cap=7;
		List<item> list = new ArrayList();
		for(int i=0;i<profit.length ;i++){
			list.add(new item(profit[i], wt[i]));
		}
		Collections.sort(list, new paircomp());
		System.out.println(list);
		float ans =0;
		for(int i=0;i<list.size() && cap != 0;i++){
			if(cap > list.get(i).wt){
				cap = cap- (list.get(i).wt);
				ans += list.get(i).profit;
				continue;
			}
			else{
				ans += cap*(list.get(i).profit/list.get(i).wt);
				cap = 0;
			}
		}
		System.out.println(ans);

	}

}

class item {
	float profit;
	float wt;

	public item(float profit, float wt) {
		super();
		this.profit = profit;
		this.wt = wt;
	}

	@Override
	public String toString() {
		return "item [profit=" + profit + ", wt=" + wt + "]";
	}
}

class paircomp implements Comparator<item> {
	@Override
	public int compare(item o1, item o2) {
		float f1 = o1.profit / o1.wt;
		float f2 = o2.profit / o2.wt;
		if (f1 > f2)
			return -1;
		return 1;
	}

}
