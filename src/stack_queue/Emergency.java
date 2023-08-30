package stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
	int id;
	int priority;
	public Person(int id, int priority) {
		this.id = id;
		// id = this.id;// 제대로 초기화되지 않는다.
		this.priority = priority;
	}
}

public class Emergency {
	public static int solution(int n, int m, int[] a) {
		int answer = 0;
		Queue<Person> Q = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			Q.offer(new Person(i, a[i]));
		}
		
		while(!Q.isEmpty()) {
			Person tmp = Q.poll();
			for (Person p : Q) {
				if(p.priority > tmp.priority) {// 대기목록에 우선순위가 높은 환자가 있다면
					Q.offer(tmp);
					tmp = null;
					break;
				}
			}
			
			if(tmp != null) {// 진료를 했다면
				answer++;
				if(tmp.id == m) {
					return answer;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(solution(n, m, a));
	}
}
