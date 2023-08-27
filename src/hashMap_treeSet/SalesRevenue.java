package hashMap_treeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SalesRevenue {
	public static ArrayList<Integer> solution(int n, int k, int[] a) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < k - 1; i++) {
			map.put(a[i], map.getOrDefault(a[i], 0) + 1);
		}
		
		int lt = 0;
		for (int rt = k - 1; rt < n; rt++) {
			map.put(a[rt], map.getOrDefault(a[rt], 0) + 1);
			answer.add(map.size());
			
			map.put(a[lt], map.get(a[lt]) - 1);
			if(map.get(a[lt]) == 0) {
				map.remove(a[lt]);
			}
			lt++;
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
		for (int i : solution(n, k, a)) {
			System.out.print(i + " ");
		}
	}
}
