package stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Education {
	public static String solution(String str, String str2) {
		String answer = "YES";
		Queue<Character> Q = new LinkedList<Character>();
		for (char c : str.toCharArray()) {
			Q.offer(c);
		}
		
		for (char c : str2.toCharArray()) {
			if(Q.contains(c)){// Q에 없다면 그냥 넘어간다.
				if(c != Q.poll()) {
					return "NO";
				}
			}
		}
		if(!Q.isEmpty()) {
			return "NO";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str2 = sc.next();
		System.out.println(solution(str, str2));
	}
}
