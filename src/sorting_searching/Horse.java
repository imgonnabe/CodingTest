package sorting_searching;

import java.util.Arrays;
import java.util.Scanner;

public class Horse {
	public static int count(int[] a, int dist) {
		int cnt = 1, ep = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i] - ep >= dist) {
				cnt++;
				ep = a[i];
			}
		}
		return cnt;
	}

	public static int solution(int n, int c, int[] a) {
		int answer = 0;
		Arrays.sort(a);
		int lt = a[0], rt = a[n - 1];
		while(lt <= rt) {
			int mid =(lt + rt) / 2;
			if(count(a, mid) >= c) {
				answer = mid;
				lt = mid + 1;
			} else {
				rt = mid - 1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(solution(n, c, a));
	}
}
