//https://paiza.jp/works/mondai/data_structure/data_structure__set_boss

package paiza.mondai.dataStructure;
import java.util.*;

public class Data_structure__set_boss {
	public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        Set<Integer> a = new LinkedHashSet<>();
        Set<Integer> b = new LinkedHashSet<>();
        Set<Integer> c = new LinkedHashSet<>();
        
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        
        for (int i = 0; i < n; i++) {
            b.add(sc.nextInt());
        }
        
        a.addAll(b);
        c.addAll(a);
        
        Integer[] arr = c.toArray(new Integer[0]);
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++){
            if (i < arr.length - 1) {
                System.out.print(arr[i] + " ");
            }  else {
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}
