package session44;

import java.util.HashMap;

public class Graph {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph(int v) {
		map = new HashMap();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap());
		}
	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	
	public boolean containsEdge(int v1 , int v2){
		return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);
	}
	public boolean containsVertex(int v){
		return map.containsKey(v);
	}
	public int noOfEdges(){
		int noOfEdges=0;
		for(int v : map.keySet()){
			noOfEdges += map.get(v).size();
		}
		return noOfEdges/2;
	}
	public void removeEdge(int v1, int v2){
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
	}
	public void removeVertex(int v){
		for(int nbr : map.get(v).keySet()){
			removeEdge(nbr, v);
		}
		map.remove(v);
	}
	public void display(){
		for(int v : map.keySet()){
			System.out.println(v +"--> " + map.get(v));
		}
	}
	
	
	
	

}
