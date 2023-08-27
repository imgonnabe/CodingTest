package hashMap_treeSet;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
	public static String solution(String str, String str2) {
		String b = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (char c : str2.toCharArray()) {
			map2.put(c, map2.getOrDefault(c, 0) + 1);
		}
		for (char x : map.keySet()) {
			if(map.size() == map2.size() && map2.containsKey(x)) {
				if(map.get(x) == map2.get(x)) {
					b = "YES";
				} else {
					return "NO";
				}
			} else {
				return "NO";
			}
		}
		return b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str2 = sc.next();
		System.out.println(solution(str, str2));
	}
}
