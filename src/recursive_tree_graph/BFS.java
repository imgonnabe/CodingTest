package recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	
	Node root;
	
	public static void BFS2(Node root) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		int L = 0;// 임의로 설정
		while(!Q.isEmpty()) {
			int len = Q.size();
			System.out.print(L + " : ");
			for (int i = 0; i < len; i++) {// offer : 1 > 2 3 > 3 4 5 > 4 5 6 7
				Node cur = Q.poll();
				System.out.print(cur.data + " ");
				if(cur.lt != null) {
					Q.offer(cur.lt);
				}
				if(cur.rt != null) {
					Q.offer(cur.rt);
				}
			}
			L++;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		BFS tree = new BFS();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		BFS2(tree.root);
	}
}
