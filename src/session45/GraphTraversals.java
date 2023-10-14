package session45;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphTraversals {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public GraphTraversals(int v) {
		map = new HashMap();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap());
		}
	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public boolean containsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);
	}

	public boolean containsVertex(int v) {
		return map.containsKey(v);
	}

	public int noOfEdges() {
		int noOfEdges = 0;
		for (int v : map.keySet()) {
			noOfEdges += map.get(v).size();
		}
		return noOfEdges / 2;
	}

	public void removeEdge(int v1, int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
	}

	public void removeVertex(int v) {
		for (int nbr : map.get(v).keySet()) {
			removeEdge(nbr, v);
		}
		map.remove(v);
	}

	public void display() {
		for (int v : map.keySet()) {
			System.out.println(v + "--> " + map.get(v));
		}
	}

	public boolean haspath(int src, int des, HashSet<Integer> visited) {
		if (src == des) {
			return true;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				boolean ans = haspath(nbrs, des, visited);
				if (ans)
					return ans;
			}
		}
		visited.remove(src);
		return false;
	}

	public void printpath(int src, int des, HashSet<Integer> visited, String ans) {
		if (src == des) {
			System.out.println(ans + des);
			return;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				printpath(nbrs, des, visited, ans + src + " ");
			}
		}
		visited.remove(src);
	}

	public boolean BFS(int src, int des) {
		Queue<Integer> queue = new LinkedList<Integer>();
		HashSet<Integer> visited = new HashSet();
		queue.add(src);
		while (!queue.isEmpty()) {
			int ele = queue.poll();
			if (visited.contains(ele)) {
				continue;
			}
			visited.add(ele);
			if (ele == des)
				return true;
			for (int nbrs : map.get(ele).keySet()) {
				if (!visited.contains(nbrs)) {
					queue.add(nbrs);
				}
			}

		}
		return false;

	}

	public void BFT() {
		Queue<Integer> queue = new LinkedList<Integer>();
		HashSet<Integer> visited = new HashSet();
		for (int src : map.keySet()) {
			if(visited.contains(src) ) continue;
			queue.add(src);
			while (!queue.isEmpty()) {
				int ele = queue.poll();
				if (visited.contains(ele)) {
					continue;
				}
				visited.add(ele);
				System.out.println(ele);
				for (int nbrs : map.get(ele).keySet()) {
					if (!visited.contains(nbrs)) {
						queue.add(nbrs);
					}
				}

			}
		}

	}
	public void DFT() {
		Stack<Integer> stack = new Stack<Integer>();
		HashSet<Integer> visited = new HashSet();
		for (int src : map.keySet()) {
			if(visited.contains(src) ) continue;
			stack.push(src);
			while (!stack.isEmpty()) {
				int ele = stack.pop();
				if (visited.contains(ele)) {
					continue;
				}
				visited.add(ele);
				System.out.println(ele);
				for (int nbrs : map.get(ele).keySet()) {
					if (!visited.contains(nbrs)) {
						stack.push(nbrs);
					}
				}

			}
		}

	}

	public boolean DFS(int src, int des) {
		Stack<Integer> stack = new Stack<Integer>();
		HashSet<Integer> visited = new HashSet();
		stack.push(src);
		while (!stack.isEmpty()) {
			int ele = stack.pop();
			if (visited.contains(ele)) {
				continue;
			}
			visited.add(ele);
			if (ele == des)
				return true;
			for (int nbrs : map.get(ele).keySet()) {
				if (!visited.contains(nbrs)) {
					stack.push(nbrs);
				}
			}

		}
		return false;

	}

}
