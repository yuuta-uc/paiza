//https://paiza.jp/works/mondai/dp_primer/dp_primer_apples_boss

import java.util.*;

public class Dp_primer_apples_boss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
		int x = sc.nextInt();
		int a = sc.nextInt();
		int y = sc.nextInt();
		int b = sc.nextInt();
		int z = sc.nextInt();
        int c = sc.nextInt();

		int[] dp = new int[n+z];
        Arrays.fill(dp,10000000000);
		dp[0] = 0;
        for(int i = 1; i < n+z; i++) {
			if(i >= x) {
				dp[i] = Math.min(dp[i],dp[i-x] + a);
			}
			if(i >= y) {
                dp[i] = Math.min(dp[i],dp[i-y] + b);
			}
			if(i >= z) {
                dp[i] = Math.min(dp[i],dp[i-z] + c);
			}
		}

		for(int i = n + z - 2; i >= 1; i--) {
			dp[i] = Math.min(dp[i],dp[i+1]);
		}


		System.out.println(dp[n]);	

    }
}