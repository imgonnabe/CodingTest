package codingtTest;

public class Substring01 {
	 public static void solution(String my_string, String overwrite_string, int s) {
		 String str = my_string.substring(0, s);
		 String str2 = my_string.substring(s + overwrite_string.length());
		 System.out.println(my_string.length());
		 System.out.println(overwrite_string.length());
	     System.out.println(str + overwrite_string + str2); 
		 
	 }
	 public static void main(String[] args) {
		solution("He11oWor1d", "lloWorl", 2);
	}
}
