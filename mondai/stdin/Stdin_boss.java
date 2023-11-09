// https://paiza.jp/works/mondai/stdin_primer/stdin_primer__matrix_data_boss

package paiza.mondai.stdin;
import java.util.*;

public class Stdin_boss {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr1 = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                arr.add(sc.nextInt());
            }
            arr1.add(arr);
        }
        
        for (int i = 0; i < arr1.size(); i++) {
            for (int j = 0; j < arr1.get(i).size(); j++) {
                if (j < arr1.get(i).size() - 1) {
                  System.out.print(arr1.get(i).get(j) +  " ");
                } else {
                  System.out.println(arr1.get(i).get(j));    
                }
            }
        }

		sc.close();
        
    }
}
