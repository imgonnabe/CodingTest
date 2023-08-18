package array;

import java.util.Scanner;

public class PrimeNumber {
	public static int solution(int N) {
		int answer = 0;
		int[] arr = new int[N + 1];
		for (int i = 2; i <= N; i++) {
			if(arr[i] == 0) {
				answer++;
				for (int j = i; j <= N; j += i) {// j의 배수만큼 증가
					arr[j] = 1;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(solution(N));
	}
}
