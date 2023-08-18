package array;

import java.util.Scanner;

public class Cal {
	public static int solution(int N, int[] arr) {
		int cnt = 0;
		int answer = 0;
		for (int i = N - 1; i >= 0; i--) {
			if(arr[i] == 1) {
				cnt += 1;
				answer += cnt;
			} else if (arr[i] == 0) {
				cnt = 0;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(N, arr));
	}
}
