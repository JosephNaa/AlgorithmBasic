package js.pekah.basic;

import java.util.ArrayList;
import java.util.List;

class Node {
	int info;
	boolean visited;
	List<Node> neighbors;
	
	public Node(int info) {
		this.info = info;
		this.visited = false;
		this.neighbors = new ArrayList<>();
	}
	
	public void addNeighbors(Node neighborsNode) {
		this.neighbors.add(neighborsNode);
	}
	
	public List<Node> getNeighbors() {
		return neighbors;
	}
	
	public void setNeighbors(List<Node> neighbors) {
		this.neighbors = neighbors;
	}
	
	public String toString() {
		return "" + info;
	}
}

public class DepthFirstSearch {
	public static void DFS(Node v) {
		System.out.print(v.info + " ");
		
		v.visited = true;
		
		List<Node> neighbors = v.getNeighbors();
		
		for (int i = 0; i < neighbors.size(); i++) {
			Node w = neighbors.get(i);
			if (w != null && !w.visited)
				DFS(w);
		}
	}
	
	public static void main(String[] args) {
		Node[] node = new Node[6];
		
		for (int i = 0; i < 6; i++) {
			node[i] = new Node(i + 1);
		}
		
		node[0].addNeighbors(node[1]);
		node[0].addNeighbors(node[2]);
		node[0].addNeighbors(node[4]);
		node[1].addNeighbors(node[0]);
		node[1].addNeighbors(node[2]);
		node[2].addNeighbors(node[0]);
		node[2].addNeighbors(node[1]);
		node[2].addNeighbors(node[3]);
		node[2].addNeighbors(node[4]);
		node[3].addNeighbors(node[2]);
		node[3].addNeighbors(node[5]);
		node[4].addNeighbors(node[0]);
		node[4].addNeighbors(node[2]);
		node[5].addNeighbors(node[2]);
		node[5].addNeighbors(node[3]);

		System.out.println("재귀를 사용한 깊이 우선 탐색 실행 결과");
		DFS(node[0]);
	}
}
