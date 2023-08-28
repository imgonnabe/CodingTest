package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {
	public static int solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for (char c : str.toCharArray()) {
			if(Character.isDigit(c)) {
				stack.push(c - 48);// char 배열로 변환해서 아스키 코드로 변환되기 때문
			} else {
				int rt = stack.pop();
				int lt = stack.pop();
				if(c == '+') {stack.push(lt + rt);}
				if(c == '-') {stack.push(lt - rt);}
				if(c == '*') {stack.push(lt * rt);}
				if(c == '/') {stack.push(lt / rt);}
			}
		}
		answer = stack.get(0);
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}
}
