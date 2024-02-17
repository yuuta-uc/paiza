//https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__lucky_number

import java.util.*;

public class B_rank_new_level_up_problems__lucky_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        int[][] arr = new int[n][5];
        for(int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = plusOne(arr[i][0]);
            arr[i][2] = minusOne(arr[i][0]);
            arr[i][3] = firstplus(arr[i][0]);
            arr[i][4] = endplus(arr[i][0]);
        }
            
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                for(int k = 0; k < 5; k++) {
                    for(int l = 0; l < 5; l++) {
                        ans = Math.min(ans, Math.abs(arr[i][k] - arr[j][l]));
                    }
                }
            }
        }

        System.out.println(ans);
	}

	public static int plusOne(int i) {
        return i + 1;
    }
    
    public static int minusOne(int i) {
        return i - 1;
    }
    
    public static int firstplus(int i) {
        String s = String.valueOf(i);
		s = "1" + s;
		int r = Integer.parseInt(s);
        return r;
    }
    
    public static int endplus(int i) {
        return i*10+1;
    }
}