//https://paiza.jp/works/challenges/571

import java.util.*;

public class C117 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int[] ramen = new int[n];
        for(int i = 0; i < n; i++) {
            ramen[i] = sc.nextInt();
        }
        
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if(ramen[i]*c - a - b*m < 0){
                ans += 1;
            }
        }
        
        System.out.println(ans);
        
    }
}