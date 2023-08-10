package codingtTest;

public class MixAlphabet {
	public static String solution(String str1, String str2) {
		char[] char1 = new char[str1.length()];
		char[] char2 = new char[str2.length()];
		for (int i = 0; i < str1.length(); i++) {
			char1[i] = str1.charAt(i);
		}
		for (int i = 0; i < str2.length(); i++) {
			char2[i] = str2.charAt(i);
		}
		char[] char3 = new char[char1.length + char2.length];
		for (int i = 0; i < char1.length + char2.length; i++) {
			if (i % 2 == 0) {
				char3[i] = char1[i / 2];
			} else {
				char3[i] = char2[i / 2];
			}
		}
		String str = "";
		for (int i = 0; i < char3.length; i++) {
			str += char3[i]; 
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println(solution("aaaaa", "bbbbb"));
	}
}
