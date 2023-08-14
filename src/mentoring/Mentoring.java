package mentoring;

import java.util.Scanner;

public class Mentoring {
	public static int solutiion(int n, int m, int[][] arr) {
		int answer = 0;
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
	}
}
