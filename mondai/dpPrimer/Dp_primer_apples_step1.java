//https://paiza.jp/works/mondai/dp_primer/dp_primer_apples_step1

import java.util.*;

public class Dp_primer_apples_step1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
        
		int[] dp = new int[n+5];
		Arrays.fill(dp,1000000000);

		dp[0] = 0;
		for(int i = 1; i < n+5; i++) {
			if (i >= 2) {
			    dp[i] = Math.min(dp[i],dp[i-2] + a);
			}

			if(i >= 5) {
				dp[i] = Math.min(dp[i],dp[i-5] + b);
			}
		}

		for (int j = n+5 -2; j >= 1; j--) {
			dp[j] = Math.min(dp[j],dp[j+1]);
		}
		System.out.println(dp[n]);

    }
}