package hashMap_treeSet;

import java.util.HashMap;
import java.util.Scanner;

public class AllAnagramSolution {
	public static int solution(String s, String s2) {
		int answer = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		for (char c : s2.toCharArray()) {
			map2.put(c, map2.getOrDefault(c, 0) + 1);
		}
		
		int lt = 0;
		for (int i = 0; i < s2.length() - 1; i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}
		
		for (int rt = s2.length() - 1; rt < s.length(); rt++) {
			map.put(s.charAt(rt), map.getOrDefault(s.charAt(rt), 0) + 1);
			if(map.equals(map2)) {
				answer++;
			}
			map.put(s.charAt(lt), map.get(s.charAt(lt)) - 1);
			if(map.get(s.charAt(lt)) == 0) {
				map.remove(s.charAt(lt));
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
