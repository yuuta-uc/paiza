// https://paiza.jp/works/mondai/dateset/day_of_week


import java.util.*;

public class Year {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
 
		int[] days = {1800, 1, 1};
		char[] date = {'水','木','金','土','日','月','火'};

		int cnt = 0;

		while (y != days[0] || m != days[1] || d != days[2]) {
			days = next_day(days);
			cnt += 1;
		}

		
		System.out.println(date[cnt%7]+"曜日");
		
		sc.close();
	}

	public static int[] next_day(int[] days) {
		days[2] += 1;
	
		if (days[2] > last_day(days)) {
			days[2] = 1;
			days[1] += 1; 
		} 
	
		if (days[1] > 12) {
			days[1] = 1;
			days[0] += 1;
		} 
		
		return days;
	}
	
	public static int last_day(int[] days) {
		if (days[1] == 2) {
			if (days[0] % 400 == 0 || days[0] % 100 != 0 && days[0] % 4 == 0) {
				return 29;
			} else {
				return 28;
			} 
		} if (days[1] == 4 || days[1] == 6 || days[1] == 9 || days[1] == 11) {
			return 30;
		}
		 else {
			return 31;
		}
	}
}