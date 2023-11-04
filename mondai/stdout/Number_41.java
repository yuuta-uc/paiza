// https://paiza.jp/works/mondai/stdout_primer/stdout_primer__print_width_step2

package paiza.mondai.stdout;
import java.util.*;

public class Number_41 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

		System.out.println(String.format("%03d", n));
        sc.close();
    }
}
