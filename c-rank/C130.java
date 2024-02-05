//https://paiza.jp/works/challenges/639

import java.util.*;
public class C130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int number = 0;
        ArrayList <Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            String q1 = sc.next();
            String q2 = sc.next();
            if(!(q1.equals("y") && q2.equals("y"))) {
                arr.add(i+1);
            } 
        }
        
        System.out.println(arr.size());
        
        for(int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        
    }
}