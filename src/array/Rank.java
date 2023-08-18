package array;

import java.util.Scanner;

public class Rank {
	public static void solution(int N, int[] arr) {
		int[] arr2 = new int[N];
		for (int i = 0; i < arr.length; i++) {
			int cnt = 1;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					cnt += 1;
				}
			}
			arr2[i] = cnt;
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		solution(N,arr);
	}
}
