package primeNumber;

import java.util.Scanner;

public class PrimeNumber2 {
	public static boolean PrimeNumber(int N) {
		if (N == 1) {
			return false;// 함수 탈출
		}
		
		for (int i = 2; i < N; i++) {
			if (N % i == 0) {	
				 return false;
			}
		}
		return true;
	}

	public static void Solution(int N, int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			int r = 0;
			while(arr[i] != 0) {
				temp = arr[i] % 10;
				r = r * 10 + temp;
				arr[i] /= 10;
			}
			if (PrimeNumber(r)) {
				System.out.print(r + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Solution(N, arr);
	}
}