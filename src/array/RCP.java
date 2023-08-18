package array;

import java.util.Scanner;

public class RCP {
	public String Solution(int N, int[] A, int[] B) {
		String answer = "";
		for (int i = 0; i < A.length; i++) {
			if(A[i] == B[i]) {
				answer += "D";
			} else if(A[i] == 1 && B[i] == 3) {
				answer += "A";
			} else if(A[i] == 2 && B[i] == 1) {
				answer += "A";
			} else if(A[i] == 3 && B[i] == 2) {
				answer += "A";
			} else {
				answer += "B";
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		int[] B = new int[N];
		for (int i = 0; i < B.length; i++) {
			B[i] = sc.nextInt();
		}
		
		RCP rcp = new RCP();
		for (char i : rcp.Solution(N, A, B).toCharArray()) {
			System.out.println(i);
			
		}
	}
}
