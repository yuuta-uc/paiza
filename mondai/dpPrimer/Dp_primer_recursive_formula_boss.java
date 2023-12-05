//https://paiza.jp/works/mondai/dp_primer/dp_primer_recursive_formula_boss

import java.util.*;

public class Dp_primer_recursive_formula_boss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[40];
        arr[0] = 1;
        arr[1] = 1;
        
        for (int i = 0; i < arr.length; i++) {
            if (i >= 2) {
                arr[i] = arr[i-1] + arr[i-2];
            }
        }
        
        for(int i = 0; i < n; i++) {
            int index = sc.nextInt() - 1;
            System.out.println(arr[index]);
        }
        
    }
}