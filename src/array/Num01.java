package array;

import java.util.Scanner;

public class Num01 {
	public void solution(int N, int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1]) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] input1 = new int[N];
		for (int i = 0; i < input1.length; i++) {
			input1[i] = sc.nextInt();
		}
		
		Num01 n = new Num01();
		System.out.print(input1[0] + " ");
		n.solution(N, input1);
	}
}
