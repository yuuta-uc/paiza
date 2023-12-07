//https://paiza.jp/works/mondai/dp_primer/dp_primer_stairs_boss

import java.util.*;
public class dp_primer_stairs_boss {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int[] dp = new int[n+1];
        dp[0] = 1;
        
        for (int i = 1; i <= n; i++) {
            dp[i] = 0;
            if (i >= a) {
                dp[i] += dp[i-a];
            }
            if (i >= b) {
                dp[i] += dp[i-b];
            }
            if (i >= c) {
                dp[i] += dp[i-c];
            }
            
        } 
        
        System.out.println(dp[n]);
        
        
    }
}