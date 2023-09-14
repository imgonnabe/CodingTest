package recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindCalf_BFS {
	static int answer = 0;
	static int[] dist = { 1, -1, 5 };
	static int[] ch;
	static Queue<Integer> Q = new LinkedList<>();

	public static int BFS(int s, int e) {
		ch = new int[10001];
		ch[s] = 1;// 숫자 있는지 체크
		Q.offer(s);
		int L = 0;// 임의로 설정
		while (!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				int x = Q.poll();
				for (int j = 0; j < 3; j++) {
					int nx = x + dist[j];
					if(nx == e) {
						return L + 1;
					}
					if(nx >= 1 && nx <= 10000 && ch[nx] == 0) {
						ch[nx] = 1;
						Q.offer(nx);
					}
				}
			}
			L++;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(BFS(s, e));
	}
}
