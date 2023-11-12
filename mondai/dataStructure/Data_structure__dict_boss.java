//https://paiza.jp/works/mondai/data_structure/data_structure__dict_boss
package paiza.mondai.dataStructure;
import java.util.*;

public class Data_structure__dict_boss {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        ArrayList<String> sArray = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            sArray.add(sc.next());
        }
        
        for (int j = 0; j < q; j++) {
            String search = sc.next();
            int count = 0;
            while (count < sArray.size()) {
                if (sArray.get(count).equals(search)) {
                    System.out.println(count+1);
                    break;
                } else if (count == sArray.size()-1) {
                    System.out.println(-1);
                } 
                count += 1;
            }
        }
    sc.close();    
    }
}
