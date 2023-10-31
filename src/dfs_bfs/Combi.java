package dfs_bfs;

import java.util.Scanner;

public class Combi {
	static int[] combi;
	static int n, m;
	
	public void DFS(int L, int s) {// s: start 번호
		if(L == m) {
			for (int i : combi) {
				System.out.print(i + " ");
			}
			System.out.println();
		} else {
			for (int i = s; i <= n;  i++) {
				combi[L] = i;
				DFS(L + 1, i + 1);
			}
		}
	}
	
	public static void main(String[] args) {
		Combi s = new Combi();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		combi = new int[m];
		s.DFS(0, 1);
	}
}
