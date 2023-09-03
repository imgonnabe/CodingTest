package sorting_searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CoordinateSort {
	public static ArrayList<Integer> solution(int n, int[][] a) {
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(a);
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][2];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int is : solution(n, a)) {
			System.out.print(is + " ");
		}
	}
}
