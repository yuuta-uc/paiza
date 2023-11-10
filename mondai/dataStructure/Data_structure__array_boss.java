//https://paiza.jp/works/mondai/data_structure/data_structure__array_boss

package paiza.mondai.dataStructure;
import java.util.*;

public class Data_structure__array_boss {
	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>(); 
        for (int i = 0; i < n; i++) {
            int j  = sc.nextInt();
            arrayList.add(j);
        }
        
        while (sc.hasNext()) {
            int m = sc.nextInt();
            if (m == 0) {
                int l = sc.nextInt();
                arrayList.add(l);
            } else if (m == 1) {
                 arrayList.remove(arrayList.size() - 1);
            } else  {
                for (int o = 0; o < arrayList.size(); o++) {
                    if (o < arrayList.size() - 1) {
                      System.out.print(arrayList.get(o) + " ");
                    } else {
                      System.out.println(arrayList.get(o));
                    }
                }
            }
        }
    sc.close();
    }
}
