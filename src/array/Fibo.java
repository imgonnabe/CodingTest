package array;

import java.util.Scanner;

public class Fibo {
	public static int fibo(int a) {
		if(a == 1) {
			return 1;
		} else if (a == 2) {
			return 1;
		} else {
			return fibo(a - 1) + fibo(a - 2);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 1; i <= N; i++) {
			System.out.print(fibo(i) + " ");
		}
		sc.close();
 	}
}