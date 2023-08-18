package array;

import java.util.Scanner;

public class PeakSolution {
	public static int solution(int n, int[][] arr) {
		int answer = 0;
		int[] dx = { -1, 0, 1, 0 };
		int[] dy = { 0, -1, 0, 1 };
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				boolean b = true;
				for (int k = 0; k < 4; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[i][j] <= arr[nx][ny]) {
						b = false;
						break;
					}
				}
				if (b) { answer++; }
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(solution(n, arr));
	}
}
