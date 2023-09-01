package sorting_searching;

import java.util.Scanner;

public class BubbleSort {
	public static int[] solution(int n, int[] a) {
		for (int i = 0; i < n - 1; i++) {// 버블이 n - 1개
			for (int j = 0; j < n - i - 1; j++) {// 뒷자리부터 정해지기 때문에 점점 범위를 줄임
				if(a[j] > a[j + 1]) {
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}
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
