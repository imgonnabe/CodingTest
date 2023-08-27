package hashMap_treeSet;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class KNumber {
	public static int solution(int n, int k, int[] a) {
		int answer = -1;
		TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());// 역순정렬
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int j2 = j + 1; j2 < n; j2++) {
					set.add(a[i] + a[j] + a[j2]);
				}
			}
		}
		int cnt = 0;
		System.out.println(set.size());
		System.out.println(set.remove(143));// true
		System.out.println(set.first());
		System.out.println(set.last());
		
		for (int i : set) {
			cnt++;
			if(cnt == k) {
				return i;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(solution(n, k, a));
	}
}
