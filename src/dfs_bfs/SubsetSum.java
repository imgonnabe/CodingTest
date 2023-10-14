package dfs_bfs;

import java.util.Scanner;

public class SubsetSum {
	static String answer = "NO";
	static int n, total = 0;
	boolean flag = false;
	
	public void DFS(int L, int sum, int[] arr) {
		if(flag) return;
		if(L == n) {
			if(total - sum == sum) {
				answer = "YES";
				flag = true;
			}
		} else {
			DFS(L + 1, sum + arr[L], arr);// 합에 arr[L] 포함o
			System.out.println("포함o " + L + " : " + sum);
			DFS(L + 1, sum, arr);// 합에 arr[L] 포함x
			System.out.println("포함x " + L + " : " + sum);
		}
	}
	public static void main(String[] args) {
		SubsetSum s = new SubsetSum();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		s.DFS(0, 0, arr);
		System.out.println(answer);
	}
}
