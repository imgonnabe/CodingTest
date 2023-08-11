package fibo;

import java.util.Scanner;

public class Fibo2 {
	public static int[] fibo(int N) {
		int[] answer = new int[N];
		answer[0] = 1;
		answer[1] = 1;
		for (int i = 2; i < answer.length; i++) {
			answer[i] = answer[i - 1] + answer[i - 2];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i : fibo(N)) {
			System.out.print(i + " ");
		}
	}
}