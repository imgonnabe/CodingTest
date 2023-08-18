package array;

import java.util.Scanner;

public class Student01 {
	public int solution(int n, int[] arr) {
		int max = arr[0];
		int answer = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				answer++;
				max = arr[i];
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Student01 stud = new Student01();
		System.out.println(stud.solution(N, arr));
	}
}