//https://paiza.jp/works/challenges/560

import java.util.*;

public class C115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n-1];
        int ans = 0;
        
        for(int i = 0; i < n-1; i++) {
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n-1; i++) {
            if(arr[i] <= m) {
                ans += arr[i];
            }
        }
        
        System.out.println(ans);
        
    }
}