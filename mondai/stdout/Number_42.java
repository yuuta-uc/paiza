//https://paiza.jp/works/mondai/stdout_primer/stdout_primer__print_width_step3

package paiza.mondai.stdout;
import java.util.*;

public class Number_42 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();

			System.out.println(String.format("%3d", m));

		}

		sc.close();
    }
}
