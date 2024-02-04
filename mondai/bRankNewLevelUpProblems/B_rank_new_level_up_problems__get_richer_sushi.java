//https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__get_richer_sushi

import java.util.*;
public class B_rank_new_level_up_problems__get_richer_sushi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
		int k = sc.nextInt();
		int[] dp = new int[n];

		int[] p = new int[n];
		for(int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++) {
			int sum = 0;
			for(int j = 0; j < k; j++) {
				dp[i] += p[(i+j)%n];
			}
			
		}

		Arrays.sort(dp);

		System.out.println(dp[n-1]);


    }
}