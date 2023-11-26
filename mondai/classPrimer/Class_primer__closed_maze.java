//https://paiza.jp/works/mondai/class_primer/class_primer__closed_maze

import java.util.*;

class Path {
	String al;
	int path1;
	int path2;


}

public class Class_primer__closed_maze {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int s = sc.nextInt();

		StringBuilder sb = new StringBuilder();
		Path[] pathes = new Path[n]; 

		for (int i = 0; i < n; i++) {
			pathes[i] = new Path();
			pathes[i].al = sc.next();
			pathes[i].path1 = sc.nextInt();
			pathes[i].path2 = sc.nextInt();
		}

		int now = s;
		sb.append(pathes[now-1].al);

		for (int j = 0; j < k; j++) {
			int branch = sc.nextInt();
			if (branch == 1) {
				now = pathes[now-1].path1;
			} else {
				now = pathes[now-1].path2;
			}
			sb.append(pathes[now-1].al);
		}

		System.out.println(sb);



		sc.close();
	}
}