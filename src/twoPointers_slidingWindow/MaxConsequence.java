package twoPointers_slidingWindow;

import java.util.Scanner;

public class MaxConsequence {
	public static int solution(int n, int k, int[] a) {
		int answer = 0, lt = 0, cnt = 0;
		for (int rt = 1; rt < n; rt++) {
			if(a[rt] == 0) {
				cnt++;
			}
			while(cnt > k) {
				if(a[lt] == 0) {
					cnt--;
				}
				lt++;// lt == 0일 때는 lt가 한칸 앞으로 간다.
			}
			answer = Math.max(answer, rt - lt + 1);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(solution(n, k, a));
	}
}
