package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
	public static String solution(String str) {
		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		for (Character c : str.toCharArray()) {
			if(c == '(') {
				stack.push(c);
			} else {
				if(stack.isEmpty()) {// 닫는 괄호가 많다면
					return "NO";
				}
				stack.pop();
			}
		}
		
		if(!stack.isEmpty()) {// 여는 괄호가 많다면
			return "NO";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}
}
