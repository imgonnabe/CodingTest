package recursive_tree_graph;

public class Subset {

	static int n;
	static int[] chk;

	public static void DFS(int L) {
		if (L == n + 1) {
			String tmp = "";
			for (int i = 1; i <= n; i++) {
				if(chk[i] == 1) {
					tmp += i + " ";
				}
			}
			if(tmp.length() > 0) {
				System.out.println(tmp);
			}
		} else {
			chk[L] = 1;
			DFS(L + 1);
			chk[L] = 0;
			DFS(L + 1);
		}
	}

	public static void main(String[] args) {
		n = 3;
		chk = new int[n + 1];
		DFS(1);
	}
}
