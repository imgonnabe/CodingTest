package recursive_tree_graph;

class Node2 {
	int  data;
	Node2 lt, rt;
	public Node2(int val) {
		this.data = val;
		lt = rt = null;
	}
}

public class ShortestRootDFS {
	
	Node2 root;
	public static int DFS(int L, Node2 root) {// 자식노드가 양쪽 있어야 에러 안난다.
		if(root.lt == null && root.rt == null) {
			return L;
		} else {
			return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
		}
	}
	
	public static void main(String[] args) {
		ShortestRootDFS tree = new ShortestRootDFS();
		tree.root = new Node2(1);
		tree.root.lt = new Node2(2);
		tree.root.rt = new Node2(3);
		tree.root.lt.lt = new Node2(4);
		tree.root.lt.rt = new Node2(5);
		System.out.println(DFS(0, tree.root));
	}
}
