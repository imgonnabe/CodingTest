package sorting_searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static int solution(int n, int m, int[] a) {
		int answer = 0;
		Arrays.sort(a);
		int lt = 0, rt = n - 1;
		while(lt <= rt) {
			int mid = (lt + rt) / 2;
			if(a[mid] == m) {
				answer = mid + 1;
				break;
			} else if(a[mid] > m){
				rt = mid - 1;
			} else {
				lt = mid + 1;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(solution(n, m, a));
	}
}
