package sorting_searching;

import java.util.Scanner;

public class SelectionSort {
	public static int[] solution(int n, int[] a) {
		for (int i = 0; i < n - 1; i++) {// n -1까지 돌면 마지막은 저절로 확정
			int idx = i;
			for (int j = i + 1; j < n; j++) {
				if(a[j] < a[idx]) {
					idx = j;
				}
			}
			int tmp = a[i];
			a[i] = a[idx];
			a[idx] = tmp;
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i : solution(n,a)) {
			System.out.print(i + " ");
		}
	}
}
