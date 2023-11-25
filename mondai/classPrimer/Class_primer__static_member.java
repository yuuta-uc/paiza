package paiza.mondai.classPrimer;
import java.util.*;

class Customer {
    int old;
    int paid = 0;
    boolean coupon;
}

public class Class_primer__static_member {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0; 
        
        Customer[] customers = new Customer[n];
        
        for (int i = 0; i < n; i++) {
            customers[i] = new Customer();
            customers[i].old = sc.nextInt();
        }
        
        for (int j = 0; j < k; j++) {
            int number = sc.nextInt();
            String order = sc.next();
            
            if (order.equals("0") || order.equals("alcohol")) {
                customers[number-1].coupon = true;
            }
            
            
            if (order.equals("0")) {
                if (customers[number-1].old >= 20) {
                    customers[number-1].paid += 500;
                } else {
                    customers[number-1].paid += 0;
                }
            }
            
            
            if (order.equals("alcohol") || order.equals("softdrink") || order.equals("food")) {
                int price = sc.nextInt();
                if (customers[number-1].old >= 20) {
                    if (order.equals("food") && customers[number-1].coupon) {
                        customers[number-1].paid += price - 200;
                    } else {
                        customers[number-1].paid += price;
                    }
                } else {
                    if ( order.equals("softdrink") || order.equals("food")) {
                         customers[number-1].paid += price;
                    } 
                }
            }
            
            if (order.equals("A")) {
                count += 1;
                System.out.println(customers[number-1].paid);
            }
        }
        
        System.out.println(count);
        sc.close();
    }
}
