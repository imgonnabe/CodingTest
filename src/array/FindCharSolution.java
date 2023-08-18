package array;

import java.util.Scanner;

public class FindCharSolution {
	public static int solution(String s, char c) {
		int answer = 0;
		s = s.toUpperCase();
		c = Character.toUpperCase(c);
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				++answer;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		char input2 = sc.next().charAt(0);
		
		System.out.println(FindCharSolution.solution(input1, input2));
	}
}
