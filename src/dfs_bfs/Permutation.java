package dfs_bfs;

import java.util.Scanner;

public class Permutation {
	static int[] pm, arr, ch;
	static int n, m;
	
	public void DFS(int L) {
		if(L == m) {
			for (int i : pm) {
				System.out.print(i + " ");
			}
			System.out.println();
		} else {
			for (int i = 0; i < n;  i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					pm[L] = arr[i];
					DFS(L + 1);
					ch[i] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Permutation s = new Permutation();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		ch = new int[n];
		pm = new int[m];
		s.DFS(0);
	}
}
