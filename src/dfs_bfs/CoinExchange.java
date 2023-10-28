package dfs_bfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CoinExchange {
	static int n, m, answer = Integer.MAX_VALUE;
	
	public void DFS(int L, int sum, Integer[] arr) {
		if(sum > m) return;
		if(L >= answer) return;// 시간복잡도 줄임
		if(sum == m) {
			answer = Math.min(answer, L);
		} else {
			for (int i = 0; i < n;  i++) {
				DFS(L + 1, sum + arr[i], arr);
			}
		}
	}
	
	public static void main(String[] args) {
		CoinExchange s = new CoinExchange();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		Integer[] arr = new Integer[n];// Collections.reverseOrder() 쓰려면 Integer로 선언
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr, Collections.reverseOrder());// 시간 복잡도 줄임
		m = sc.nextInt();
		s.DFS(0, 0, arr);
		System.out.println(answer);
	}
}
