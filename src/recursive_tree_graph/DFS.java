package recursive_tree_graph;


public class DFS {
	
	Node root;
	
	public static void DFS2(Node root) {
		if(root == null) {
			return;
		} else {
			DFS2(root.lt);
			System.out.print(root.data + " ");// 앞에 있으면 전위순회, 중간이면 중위순회, 마지막이면 후위순회
			DFS2(root.rt);
		}
	}
	
	public static void main(String[] args) {
		DFS tree = new DFS();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		DFS2(tree.root);
	}
}
