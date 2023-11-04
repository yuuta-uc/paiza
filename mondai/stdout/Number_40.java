// https://paiza.jp/works/mondai/stdout_primer/stdout_primer__print_width_step1

package paiza.mondai.stdout;
import java.util.*;

public class Number_40 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

		System.out.println(String.format("%3d", n));
        sc.close();
    }
}
