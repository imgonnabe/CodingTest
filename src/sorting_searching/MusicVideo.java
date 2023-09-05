package sorting_searching;

import java.util.Arrays;
import java.util.Scanner;

public class MusicVideo {
	public static int count(int[] a, int capacity) {
		int cnt = 1, sum = 0;
		for (int i : a) {
			if(sum + i > capacity) {
				cnt++;
				sum = i;// 초기화
			} else {
				sum += i;
			}
		}
		return cnt;
	}

	public static int solution(int n, int m, int[] a) {
		int answer = 0;
		int lt = Arrays.stream(a).max().getAsInt();// 배열 요소 중에 최대값
		int rt = Arrays.stream(a).sum();// 배열 요소들 더한 값
		while(lt <= rt) {
			int mid = (lt + rt) / 2;
			if(count(a, mid) <= m) {
				answer = mid;
				rt = mid - 1;
			} else {
				lt = mid + 1;
			}
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
