package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class ClawCrane {
	public static int solution(int n, int[][] a, int m, int[] b) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for (int i : b) {
			for (int j = 0; j < n; j++) {
				if(a[j][i - 1] != 0) {
					int tmp = a[j][i - 1];
					a[j][i - 1] = 0;
					if(!stack.isEmpty() && tmp == stack.peek()) {
						answer += 2;
						stack.pop();
					} else {
						stack.push(tmp);
					}
					break;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int m = sc.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		System.out.println(solution(n, a, m, b));
	}
}
