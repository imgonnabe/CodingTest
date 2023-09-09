package recursive_tree_graph;

class Node {
	int data;
	Node lt, rt;// Node 클래스 객체 주소 저장
	public Node(int val) {// 생성자
		this.data = val;
		lt = rt = null;// 처음에는 null로 설정
	}
}

public class BinarySearchTree {
	
	Node root;
	
	public static void DFS(Node root) {
		if(root == null) {
			return;
		} else {
			DFS(root.lt);
			System.out.print(root.data + " ");// 앞에 있으면 전위순회, 중간이면 중위순회, 마지막이면 후위순회
			DFS(root.rt);
		}
	}
	
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		DFS(tree.root);
	}
}
