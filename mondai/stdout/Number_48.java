// https://paiza.jp/works/mondai/stdout_primer/stdout_primer__specific_format_step4

package paiza.mondai.stdout;
import java.util.*;

public class Number_48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt(); 
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (j < w - 1) {
                   System.out.print(String.format("(%d, %d)",a,b));
                   System.out.print(" | ");
                } else {
                   System.out.println(String.format("(%d, %d)",a,b));
                }
            }
            if (i != h - 1) {
                for (int k = 0; k < w * 6 + (w - 1) * 3; k++) {   
                    System.out.print("=");  
                }
                System.out.println();
            }
        }
        
        sc.close();
    }
}

// public class Number_48 {
//     public static void main(String[] args) {
		
// 	   Scanner sc = new Scanner(System.in);

//        int h = sc.nextInt();
// 	   int w = sc.nextInt();
// 	   int a = sc.nextInt();
// 	   int b = sc.nextInt();

// 	   for (int i = 0; i < h; i++) {
// 		   for (int j = 0; j < w; j++) {
// 			   if (j == w - 1) {
// 				   System.out.println(String.format("(%d, %d)", a, b));
// 			   } else { 
// 				   System.out.print(String.format("(%d, %d) | ", a, b));
// 			   }
// 		   }
		   
// 		   for (int j = 0; j < w; j++) {
// 		       if (i == h - 1) {
// 		           System.out.println();
// 		       } else if (j == w - 1) {
// 				   System.out.println("========");
// 			   } else {
// 				   System.out.print("========");
// 			   }
// 		   }
		   
// 	   }sc.close();
       
//     }
// }