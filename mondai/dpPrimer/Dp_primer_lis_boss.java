//https://paiza.jp/works/mondai/dp_primer/dp_primer_lis_boss

import java.util.*;

public class dp_primer_lis_boss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int[] dp = new int[n];
        dp[0] = 1;
        
        for(int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if(arr[i] < arr[j]) {
                  dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        
        Arrays.sort(dp);
        
        System.out.println(dp[n-1]);

    }
}