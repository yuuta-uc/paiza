package paiza.mondai.classPrimer;
import java.util.*;

class Customer {
    int number;
    int paid;
    int old;
    boolean coupon = false;
}

public class Class_primer__static_member {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        Customer[] customers = new Customer[n];
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            customers[i] = new Customer();
            customers[i].old = sc.nextInt();
        }
        
        for (int j = 0; j < k; j++) {
            int customerNumber = sc.nextInt();
            String order = sc.next();
            
            
            if (order.equals("0") || order.equals("alcohol")) {
               customers[customerNumber-1].coupon = true;
            }
            
            if (order.equals("0") || order.equals("alcohol") && customers[customerNumber-1].old < 20 ) {
              continue;
            }
            
            if (order.equals("0")) {
                System.out.println("ber");
                customers[customerNumber-1].paid += 500;
            }
            
            if (order.equals("alcohol") || order.equals("food") || order.equals("softdrink")) {
               int price = sc.nextInt();
               if (customers[customerNumber-1].coupon && order.equals("food")) {
                customers[customerNumber-1].paid += price - 200;
               } else {
                   customers[customerNumber-1].paid += price;
               }
            }
            if (order.equals("A")) {
                count += 1;
                System.out.println(customers[customerNumber-1].paid);
            }
            
        }
		sc.close();
		System.out.println(count);
	}   
}
