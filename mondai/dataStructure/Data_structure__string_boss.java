package paiza.mondai.dataStructure;
import java.util.*;

public class Data_structure__string_boss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        ArrayList<String> table = new ArrayList<>();
        
        
        for (int i = 0; i < h; i++) {
            String row = sc.next();
            table.add(row);
        }
        
        for (int j = 0; j < table.size(); j++) {
            if (j == r - 1) {
                if (table.get(j).charAt(c-1) == '#') {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                    return;
                }
            }
        }
        sc.close();
	}
}
