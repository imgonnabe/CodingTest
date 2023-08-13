package peak;

import java.util.Scanner;

public class Peak {
	public static int solution(int N, int[][] arr) {
		int answer = 0;
		for (int i = 1; i < N + 1; i++) {
			for (int j = 1; j < N + 1; j++) {
				if (arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i + 1][j]
						&& arr[i][j] > arr[i][j + 1]) {
					answer++;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N + 2][N + 2];
		for (int i = 1; i < N + 1; i++) {
			for (int j = 1; j < N + 1; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(solution(N, arr));
	}
}
