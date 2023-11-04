//https://paiza.jp/works/mondai/stdout_primer/stdout_primer__format_real_number_step4

package paiza.mondai.stdout;
import java.util.*;

public class Number_38 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double d = sc.nextDouble();
        int m = sc.nextInt();

        System.out.println(String.format("%." + m + "f", d));
        sc.close();
    }
}