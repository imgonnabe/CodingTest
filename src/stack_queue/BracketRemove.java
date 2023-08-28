package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class BracketRemove {
	public static void solution(String str) {
		Stack<Character> stack = new Stack<>();
		for (char c : str.toCharArray()) {
			if(c != ')') {
				stack.push(c);
			} else {// c == ')'
				while(stack.pop() != '(');// 계속 pop되다가 '('를 만나면 pop되고 while문을 빠져나옴
			}
		}
		
		for (char c : stack) {
			System.out.print(c);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		solution(str);
	}
}
