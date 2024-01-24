//https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__fuel_economy

import java.util.*;
public class B_rank_new_level_up_problems__fuel_economy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int oneL = sc.nextInt();
        int twoL = sc.nextInt();
        int l = sc.nextInt();
        int n = sc.nextInt();
        
        int[] arr = new int[n+1];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arr[n] = l;
        
        long ans = 0L;
        long start = 0L;
        
        for(int i = 0; i <= n; i++) {
            long p = arr[i]-start;
            if(x >= p) {
                ans += p*oneL;
            } else {
                ans += x*oneL + (p-x)*twoL;
            }
            start = arr[i];
        }
        
        
        System.out.println(ans);
        
    }
}