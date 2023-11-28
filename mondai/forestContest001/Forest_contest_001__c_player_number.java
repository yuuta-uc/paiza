//https://paiza.jp/works/mondai/forest_contest_001/forest_contest_001__c_player_number

import java.util.*;

public class Forest_contest_001__c_player_number {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        Map<Integer, String> treeMap = new TreeMap<>();
        
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            String p = sc.next();
            treeMap.put(b,p);
        }
        
        treeMap.forEach((b, p) -> System.out.println(b + " " + p));
        
        
    }
}