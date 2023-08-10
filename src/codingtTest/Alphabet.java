package codingtTest;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = new char[a.length()];
        for (int i = 0; i < arr.length; i++) {
			char ch = a.charAt(i);
			arr[i] = ch;
			if (arr[i] < 91) {
				arr[i] = (char) (ch + 32);
			} else {
				arr[i] = (char) (ch - 32);
			}
		}
        for (char c : arr) {
			System.out.print(c);
		}
        sc.close();
    }
}
