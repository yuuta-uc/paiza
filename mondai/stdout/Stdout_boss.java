
package paiza.mondai.stdout;
import java.util.*;


public class Stdout_boss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt(); 
        int a = sc.nextInt();
        int b = sc.nextInt();

		for (int i = 0; i < h; i++) {
			for (int j = 0; j <w; j++) {
				System.out.print(String.format("(%9d, %9d)",a,b));
				if (j < w - 1) {
					System.out.print(" | ");
				} else {
					System.out.println();
				}
			} 
			if (i != h - 1) {
                for (int k = 0; k < w * 22 + (w - 1) * 3; k++) {   
                    System.out.print("=");  
                }
                System.out.println();
            }
		}

		sc.close();
	}
}
