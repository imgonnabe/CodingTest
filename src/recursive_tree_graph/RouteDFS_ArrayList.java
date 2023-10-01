package recursive_tree_graph;

import java.util.ArrayList;
import java.util.Scanner;

	/*방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프
	로그램을 작성하세요. 아래 그래프에서 1번 정점에서 5번 정점으로 가는 가지 수는
	1 2 3 4 5
	1 2 5
	1 3 4 2 5
	1 3 4 5
	1 4 2 5
	1 4 5
	
	첫째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M가 주어진다. 그 다음부터 M줄에 걸쳐 연
	결정보가 주어진다.
	
	5 9
	1 2
	1 3
	1 4
	2 1
	2 3
	2 5
	3 4
	4 2
	4 5*/

public class RouteDFS_ArrayList {// 더효율적
	static int n, m, answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;// 경로 확인 유무
	
	public void DFS(int v) {
		if(v == n) {
			answer++;
		} else {
			for (int nv : graph.get(v)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					DFS(nv);
					ch[nv] = 0;// 뒤로 돌아감
				}
			}
		}
	}
	
	public static void main(String[] args) {
		RouteDFS_ArrayList D = new RouteDFS_ArrayList();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		ch = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		for (int i = 1; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
		}
		ch[1] = 1;
		D.DFS(1);
		System.out.println(answer);
		
	}
}
