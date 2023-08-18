package array;

import java.util.Scanner;

public class FindChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();// 공백 전까지 sc.nextLine() > 엔터 치기 전까지
		// Hello World
		// sc.next() > Hello / sc.nextLine() > Hello World
		char input2 = sc.next().charAt(0);
		input1 = input1.toUpperCase();
		input2 = Character.toUpperCase(input2);
		
		int sum = 0;
		for (char ch : input1.toCharArray()) {
			if (ch == input2) {
				sum++;
			}
		}
		System.out.println(sum);
		sc.close();

	}
}