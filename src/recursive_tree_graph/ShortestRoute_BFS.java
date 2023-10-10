package recursive_tree_graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

	/*
	 * 1번 정점에서 각 정점으로 가는 최소 이동 간선 수
	 */

public class ShortestRoute_BFS {
	static int n, m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch, dis;// 경로 확인 유무
	
	public void BFS(int v) {
		Queue<Integer> q = new LinkedList<>();
		ch[v] = 1;
		dis[v] = 0;
		q.offer(v);
		while(!q.isEmpty()) {
			int cv = q.poll();
			for (int nv : graph.get(cv)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					q.offer(nv);
					dis[nv] = dis[cv] + 1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ShortestRoute_BFS D = new ShortestRoute_BFS();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for (int i = 1; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n + 1];
		dis = new int[n + 1];
		for (int i = 1; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
		}
		D.BFS(1);
		for (int i = 2; i <= n; i++) {
			System.out.println(i + " : " + dis[i]);
		}
	}
}
