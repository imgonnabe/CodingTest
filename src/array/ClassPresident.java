package array;

import java.util.Scanner;

public class ClassPresident {
	public static int solution(int n, int[][] arr) {
		int answer = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			int cnt = 0;
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < 5; k++) {
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt > max) {
				max = cnt;
				answer = i + 1;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(solution(n,arr));
	}
}
