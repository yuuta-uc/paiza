//https://paiza.jp/works/mondai/dp_primer/dp_primer_partial_sums_step1

import java.util.*;

public class Dp_primer_partial_sums_step1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int x = sc.nextInt();

		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
		  a[i] = sc.nextInt();
		}

		long[] dp = new long[x + 1];

        dp[0] = 1;
		for(int i = 1; i <= x; i++) {
			dp[i] = 0;
		}

		for (int i = 0; i < n; i++) {
			for (int j = x; j >= a[i]; j--) {
				dp[j] += dp[j - a[i]];
				dp[j] = dp[j] % 1000000007;
			}
		}

		System.out.println(dp[x]);

    }
}