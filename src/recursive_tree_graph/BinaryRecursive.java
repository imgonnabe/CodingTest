package recursive_tree_graph;

public class BinaryRecursive {
	public static void DFS(int n) {
		if(n == 0) {
			return;
		} else {
			DFS(n / 2);// line 8
			System.out.print(n % 2 + "");
		}
	}
	
	public static void main(String[] args) {
		DFS(11);
	}
}
