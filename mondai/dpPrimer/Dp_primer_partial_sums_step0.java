//https://paiza.jp/works/mondai/dp_primer/dp_primer_partial_sums_step0

import java.util.*;

public class Dp_primer_partial_sums_step0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int x = sc.nextInt();

		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
		a[i] = sc.nextInt();
		}

		boolean[] dp = new boolean[x + 1];

		dp[0] = true;
		for(int i = 1; i <= x; i++) {
			dp[i] = false;
		}

		for (int i = 0; i < n; i++) {
			for (int j = x; j >= a[i]; j--) {
				if (dp[j - a[i]]) {
					dp[j] = true;
				}
			}
		}

		if(dp[x]) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

    }
}