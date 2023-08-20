package array;

import java.util.Scanner;

public class Grid {
	public static int solution(int N, int[][] arr) {
		int answer = 0;
		for (int i = 0; i < N; i++) {
			int temp = 0;
			int temp2 = 0;
			for (int j = 0; j < N; j++) {
				temp += arr[i][j];
				temp2 += arr[j][i];
			}
			answer = Math.max(answer, temp);
			answer = Math.max(answer, temp2);
		}
		
		int temp = 0;
		int temp2 = 0;
		for (int i = 0; i < N; i++) {
			temp += arr[i][i];
			temp2 += arr[i][N-i-1];
		}
		answer = Math.max(answer, temp);
		answer = Math.max(answer, temp2);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(solution(N, arr));
		sc.close();
	}
}
