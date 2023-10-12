package dfs_bfs;

import java.util.Scanner;

public class Badook {
	static int answer = Integer.MIN_VALUE, c, n;
	
	public void DFS(int L, int sum, int[] arr) {
		if(sum > c) return;
		if(L == n) {
			answer = Math.max(answer, sum);
		} else {
			DFS(L + 1, sum + arr[L], arr);// 합에 arr[L] 포함o
			System.out.println("포함o " + L + " : " + sum);
			DFS(L + 1, sum, arr);// 합에 arr[L] 포함x
			System.out.println("포함x " + L + " : " + sum);
		}
	}
	public static void main(String[] args) {
		Badook s = new Badook();
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		s.DFS(0, 0, arr);
		System.out.println(answer);
	}
}
