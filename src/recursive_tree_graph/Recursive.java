package recursive_tree_graph;

public class Recursive {
	public static void DFS(int n) {
		if(n == 0) {
			return;
		} else {
			DFS(n - 1);// line 8
			System.out.print(n + " ");// DFS(n - 1)위로 가면 3 2 1로 찍힌다.
		}
	}
	
	public static void main(String[] args) {
		DFS(3);
	}
}
