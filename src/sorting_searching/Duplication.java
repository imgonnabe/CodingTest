package sorting_searching;

import java.util.Arrays;
import java.util.Scanner;

public class Duplication {
	public static String solution(int n, int[] a) {
		String answer = "U";
		Arrays.sort(a);// 정렬
		for (int i = 0; i < n - 1; i++) {
			if(a[i] == a[i + 1]) {
				return "D";
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(solution(n, a));
	}
}
