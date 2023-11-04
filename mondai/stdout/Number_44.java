//https://paiza.jp/works/mondai/stdout_primer/stdout_primer__print_width_boss

package paiza.mondai.stdout;
import java.util.*;

public class Number_44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
		int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			System.out.println(String.format("%"+ m + "d", a));
		}
        sc.close();
    }
}