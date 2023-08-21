package twoPointers_slidingWindow;

import java.util.Scanner;

public class MaxSales {
	public static int solution(int n, int m, int[] a) {
		int answer, sum = 0;
		for (int i = 0; i < m; i++) {
			sum += a[i];
		}
		answer = sum;
		for (int i = m; i < n; i++) {
			sum += (a[i] - a[i - m]);
			answer = Math.max(answer, sum);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(solution(n, m, a));
	}
}
