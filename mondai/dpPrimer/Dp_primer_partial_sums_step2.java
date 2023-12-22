//https://paiza.jp/works/mondai/dp_primer/dp_primer_partial_sums_step2

import java.util.*;

public class Dp_primer_partial_sums_step2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int x = sc.nextInt();

		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
		  a[i] = sc.nextInt();
		}

		int[] dp = new int[x + 1];

		for(int i = 1; i <= x; i++) {
			dp[i] = n+1;
		}
		dp[0] = 0;

		for (int i = 0; i < n; i++) {
			for (int j = x; j >= a[i]; j--) {
				if (dp[j - a[i]] == n + 1) continue;
				dp[j] = Math.min(dp[j], dp[j - a[i]] + 1);
			}
		}

		if(dp[x] == n+1) {
			System.out.println(-1);
		} else {
			System.out.println(dp[x]);
		}

    }
}