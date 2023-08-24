package twoPointers_slidingWindow;

import java.util.Scanner;

public class ConsecutivePlus {
	public static int solution(int n) {
		int answer = 0, sum = 0;
		int lt = 1;
		for (int rt = 1; rt < n; rt++) {
			sum += rt;
			if(sum == n) {
				answer++;
			}
			while(sum > n) {
				sum -= lt++;
				if(sum == n) {
					answer++;
				}
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
