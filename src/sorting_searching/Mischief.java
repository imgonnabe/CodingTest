package sorting_searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Mischief {
	public static ArrayList<Integer> solution(int n, int[] a) {
		ArrayList<Integer> answer = new ArrayList<>();
		int[] tmp = a.clone();// 깊은 복사
		Arrays.sort(a);
		for (int i = 0; i < n; i++) {
			if(a[i] != tmp[i]) {
				answer.add(i + 1);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i : solution(n, a)) {
			System.out.print(i + " ");
		}
	}
}
