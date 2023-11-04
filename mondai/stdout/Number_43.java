//https://paiza.jp/works/mondai/stdout_primer/stdout_primer__print_width_step4

package paiza.mondai.stdout;
import java.util.*;

public class Number_43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
		int m = sc.nextInt();

        System.out.println(String.format("%" + m + "d", n));
        sc.close();
    }
}
