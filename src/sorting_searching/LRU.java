package sorting_searching;

import java.util.Scanner;

public class LRU {
	public static int[] solution(int s, int n, int[] a) {
		int[] cache = new int[s];
		for (int i = 0; i < n; i++) {// 작업번호
			int pos = -1;
			for (int j = 0; j < s; j++) {// 캐시
				if (a[i] == cache[j]) {// 캐시메모리 안에 작업번호가 있으면 인덱스 지정
					pos = j; 
				}
			}

			if (pos == -1) {// 캐시에 작업번호 없으면
				for (int k = s - 1; k >= 1; k--) {
					cache[k] = cache[k - 1];
				}
			} else {
				for (int k = pos; k >= 1; k--) {
					cache[k] = cache[k - 1];
				}
			}
			cache[0] = a[i];

		}
		return cache;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i : solution(s, n, a)) {
			System.out.print(i + " ");
		}
	}
}
