package paiza.mondai.stdout;
import java.util.*;

// https://paiza.jp/works/mondai/stdout_primer/stdout_primer__specific_format_step2

public class Number_46 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
	   int n = sc.nextInt();
	   int a = sc.nextInt();
	   int b = sc.nextInt();

	   for (int i = 0; i < n; i++) {
		   if (i < n - 1) {
	           System.out.print(String.format("(%s, %s), ",a,b));
		   } else {
			   System.out.println(String.format("(%s, %s)",a,b));
		   }
	   }
       sc.close();
    }
}