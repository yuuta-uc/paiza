// https://paiza.jp/works/mondai/stdout_primer/stdout_primer__specific_format_step3

package paiza.mondai.stdout;

public class Number_47 {
    public static void main(String[] args) {
       
	   for (int i = 1; i <= 9; i++) {
	       for (int j = 1; j <= 9; j++) {
			   if (j == 9 && i == 9) {
			       System.out.println(String.format("%2d",i*j));	   
			   } else if (j == 9) {
				   System.out.println(String.format("%2d",i*j));
				   System.out.println("==========================================");
			   } 
			   else {
			       System.out.print(String.format("%2d | ",i*j));
			   }
		   }
	   }
       
    }
}