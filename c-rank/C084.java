// C084:【キャンペーン問題】枠で囲む

import java.util.*;
public class C084 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        
        for (int i = 0; i < str.length() + 2; i++) {
            if (i == str.length() + 1) {
                System.out.println("+");
            } else {
                System.out.print("+");
            }
        }
        
        System.out.println("+" + str + "+");
        
        for (int i = 0; i < str.length() + 2; i++) {
            if (i == str.length() + 1) {
                System.out.println("+");
            } else {
                System.out.print("+");
            }
        }
		sc.close();
        
    }
}
