//https://paiza.jp/works/challenges/177
//C039:古代の数式

import java.util.*;
public class C039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] moji = sc.next().split("\\+");
        int ans = 0;
        
        for(String m : moji) {
            int a = 0;
            String[] s = m.split("");
            for(int i = 0; i < s.length; i++) {
                if(s[i].equals("/")) {
                    a += 1;
                } else {
                    a += 10;
                }
            }
            
            ans += a;
        }
        
        System.out.println(ans);
        
    }
}