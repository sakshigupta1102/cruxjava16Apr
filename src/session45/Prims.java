package session45;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

import session45.Prims.Edgepair;

public class Prims {
	HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap();

	public Prims(int v) {
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap());
		}
	}

	public void addedge(int u, int v, int cost) {
		map.get(u).put(v, cost);
		map.get(v).put(u, cost);
	}
	
class Edgepair{
	int a;
	int b;
	int cost;
	public Edgepair(int a, int b, int cost) {
		this.a = a;
		this.b = b;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Edgepair [a=" + a + ", b=" + b + ", cost=" + cost + "]";
	}
	public void prims() {
		PriorityQueue<Edgepair> pq = new PriorityQueue(new paircomp());
		HashSet<Integer> visited = new HashSet();
		pq.add(new Edgepair(1, 1, 0));
		while (!pq.isEmpty()) {
			Edgepair rp = pq.poll();
			if (visited.contains(rp.a)) {
				continue;
			}
			visited.add(rp.a);
			System.out.println(rp);
			for (int nbrs : map.get(rp.a).keySet()) {
				if (!visited.contains(nbrs)) {
					pq.add(new Edgepair(nbrs, rp.a, map.get(rp.a).get(nbrs)));
				}
			}

		}
	}

	
	
}
}
class paircomp implements  Comparator<Edgepair>{
	@Override
	public int compare(Edgepair o1, Edgepair o2) {
		// TODO Auto-generated method stub
		if(o1.cost < o2.cost) return -1;
		return 1;
	}
	
}






