package dfs_bfs;

import java.util.ArrayList;
import java.util.Scanner;

public class Pizza {
	static int n, m, len, answer = Integer.MAX_VALUE;
	static int[] combi;
	static ArrayList<Point> h, pz;

	public void DFS(int L, int s) {
		if (L == m) {
			int sum = 0;
			for (Point h : h) {
				int dis = Integer.MAX_VALUE;
				for (int i : combi) {
					dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
				}
				sum += dis;
			}
			answer = Math.min(answer, sum);
		} else {
			for (int i = s; i < len; i++) {
				combi[L] = i;
				DFS(L + 1, i + 1);
			}
		}
	}

	public static void main(String[] args) {
		Pizza s = new Pizza();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		pz = new ArrayList<>();
		h = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int tmp = sc.nextInt();
				if (tmp == 1)
					h.add(new Point(i, j));
				else if (tmp == 2)
					pz.add(new Point(i, j));
			}
		}
		len = pz.size();
		combi = new int[m];
		s.DFS(0, 0);
		System.out.println(answer);
	}
}
