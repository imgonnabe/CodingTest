package sorting_searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point> {
	public int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point obj) {
		if(this.x == obj.x) {
			return this.y - obj.y;// 오름차순(1 -> 5) : 1-5(음수)가 되어야 한다.
		} else {// 내림차순(5 -> 1) : 1-5(음수)가 되어야 한다. obj.y - this.y
			return this.x - obj.x;
		}
	}
}

public class CoordinateSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Point> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr.add(new Point(x, y));
		}
		Collections.sort(arr);
		for (Point point : arr) {
			System.out.println(point.x + " " + point.y);
		}
	}
}
