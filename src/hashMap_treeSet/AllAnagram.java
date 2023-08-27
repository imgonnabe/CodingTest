package hashMap_treeSet;

import java.util.HashMap;
import java.util.Scanner;

public class AllAnagram {
	public static int solution(String s, String s2) {
		int answer = 0;
		char[] x = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		for (char c : s2.toCharArray()) {
			map2.put(c, map2.getOrDefault(c, 0) + 1);
		}
		
		for (int i = 0; i < s2.length() - 1; i++) {
			map.put(x[i], map.getOrDefault(x[i], 0) + 1);
		}
		
		int lt = 0;
		for (int rt = s2.length() - 1; rt < x.length; rt++) {
			map.put(x[rt], map.getOrDefault(x[rt], 0) + 1);
			if(map.equals(map2)) {
				answer++;
			}
			map.put(x[lt], map.get(x[lt]) - 1);
			if(map.get(x[lt]) == 0) {
				map.remove(x[lt]);
			}
			lt++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s2 = sc.next();
		System.out.println(solution(s, s2));
	}
}
