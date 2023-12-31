package twoPointers_slidingWindow;

import java.util.Scanner;

public class ConsecutivePlusCalc {
	public static int solution(int n) {
		int answer = 0, cnt = 1;
		n--;
		while(n > 0) {
			cnt++;
			n -= cnt;
			if(n % cnt == 0) {
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solution(n));
	}
}