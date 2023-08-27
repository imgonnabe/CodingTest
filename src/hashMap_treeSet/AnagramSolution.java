package hashMap_treeSet;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramSolution {
	public static String solution(String str, String str2) {
		String b = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (char c : str2.toCharArray()) {
			if(!map.containsKey(c) || map.get(c) == 0) {
				return "No";
			}
			map.put(c, map.get(c) - 1);
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
