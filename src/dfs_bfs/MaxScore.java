package dfs_bfs;

import java.util.Scanner;

public class MaxScore {
	static int answer = Integer.MIN_VALUE, n, m;
	
	public void DFS(int L, int sum, int time, int[] a, int[] b) {
		if(time > m) {
			return;
		}
		if(L == n) {
			answer = Math.max(answer, sum);
		} else {
			DFS(L + 1, sum + a[L], time + b[L], a, b);
			DFS(L + 1, sum, time, a, b);
		}
	}
	
	public static void main(String[] args) {
		MaxScore s = new MaxScore();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int[] a = new int[n];// 점수
		int[] b = new int[n];// 제한시간
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		s.DFS(0, 0, 0, a, b);
		System.out.println(answer);
	}
}
