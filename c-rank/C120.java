//C120:花のリース

import java.util.*;

public class C120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s_1 = sc.next();
        String s_2 = sc.next();
        boolean b = false;
        
        for(int i = 0; i < n; i++) {
            String new_s = "s";
            new_s = s_2.charAt(s_2.length() - 1) + s_2.substring(0,s_2.length() - 1 );
            if(new_s.equals(s_1)) {
                b = true;
            }
            s_2 = new_s;
        }
    
        if(b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}