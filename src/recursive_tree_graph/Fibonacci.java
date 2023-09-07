package recursive_tree_graph;

public class Fibonacci {
	static int[] fibo;
	
	public static int DFS(int n) {// 재귀함수는 함수가 호출될 때마다 스택에 프레임이 생긴다. 성능 떨어짐
		if(fibo[n] > 0) {// 이미 값이 있다면
			return fibo[n];
		}
		
		if(n == 1) {
			return fibo[n] = 1;
		} else if (n == 2) {
			return fibo[n] = 1;
		} else {
			return fibo[n] = DFS(n - 2) + DFS(n - 1);
		}
	}
	
	public static void main(String[] args) {
		int n = 10;
		fibo = new int[n + 1];
		DFS(n);
		for (int i = 1; i < fibo.length; i++) {
			System.out.print(fibo[i] + " ");
		}
	}
}
