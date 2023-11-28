package greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture>{
	public int money;
	public int time;
	public Lecture(int money, int time) {
		this.money = money;
		this.time = time;
	}
	@Override
	public int compareTo(Lecture o){
		return o.time - this.time;// 내림차순
	}
}

public class MaxMoneySchedule {
	static int n, max = Integer.MAX_VALUE;
	public int solution(ArrayList<Lecture> arr) {
		int answer = 0;
		// PriorityQueue<Integer> pQ = new PriorityQueue<>();// 제일 작은 값을 우선순위로 꺼냄
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());// 큰 값을 우선순위로 해서 꺼냄
		Collections.sort(arr);
		int j = 0;
		for (int i = max; i >= 1; i--) {
			for (; j < n; j++) {
				if(arr.get(j).time < i) break;
				pQ.offer(arr.get(j).money);
			}
			if(!pQ.isEmpty()) answer += pQ.poll();
		}
		return answer;
	}
	
	public static void main(String[] args) {
		MaxMoneySchedule p = new MaxMoneySchedule();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ArrayList<Lecture> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			int d = sc.nextInt();
			arr.add(new Lecture(m, d));
			if(d > max) max = d;// 날짜중에 제일 큰 값
		}
		System.out.println(p.solution(arr));
	}
}
