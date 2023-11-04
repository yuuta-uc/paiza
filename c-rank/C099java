// C099:折り紙の貼り合わせ

import java.util.*;

public class C099 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int d = sc.nextInt();
        
        int[] arr = new int[n-1];
        for (int i = 0; i< arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int ans = d;
        for (int i : arr) {
            ans += d - i;
        }
        
        System.out.println(ans * d);
    }
}