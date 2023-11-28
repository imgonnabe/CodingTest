package greedy_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time2 implements Comparable<Time2>{
	public int time;
	public char state;
	public Time2(int time, char state) {
		this.time = time;
		this.state = state;
	}
	@Override
	public int compareTo(Time2 o){
		if(this.time == o.time) return this.state - o.state;// s, e 알파벳으로 정렬
		else return this.time - o.time;
	}
}

public class Wedding {
	public int solution(ArrayList<Time2> arr) {
		int answer = Integer.MIN_VALUE;
		Collections.sort(arr);
		int cnt = 0;// 현재 몇명이 있는지
		for (Time2 ob : arr) {
			if(ob.state >= 's') cnt++;
			else cnt--;
			answer = Math.max(answer, cnt);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Wedding p = new Wedding();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Time2> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int st = sc.nextInt();
			int et = sc.nextInt();
			arr.add(new Time2(st, 's'));
			arr.add(new Time2(et, 'e'));
		}
		System.out.println(p.solution(arr));
	}
}
