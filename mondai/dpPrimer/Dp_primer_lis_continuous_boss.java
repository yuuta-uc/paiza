//https://paiza.jp/works/mondai/dp_primer/dp_primer_lis_continuous_boss
import java.util.*;

public class dp_primer_lis_continuous_boss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int[] dp = new int[n];
        dp[0] = 1;
        
        for(int i = 1; i < n; i++) {
            if(arr[i] <= arr[i-1]) {
                dp[i] = dp[i-1] + 1;
            } else {
                dp[i] = 1;
            }
        }
        
        Arrays.sort(dp);
        
        System.out.println(dp[n-1]);

    }
}