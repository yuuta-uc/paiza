import java.util.*;

class Person {
    static int left;
    int amont;
    
    Person() {
        this.amont = 0;
    }
    
    void orderSoft(int cost) {
        this.amont += cost;
    }
    
    void orderFood(int cost) {
        this.amont += cost;
    }
    
    void orderAL(int cost) {}
    
    void orderAL() {
        orderAL(500);
    }
    
    void left() {
        left++;
    }
}

class Adalt extends Person {
    
    boolean drunk;
    
    Adalt() {
        super();
        boolean drunk = false;
    }
    
    void orderFood(int cost) {
        if (drunk) {
            cost -= 200;
        }
        super.orderFood(cost);
    }
    
    void orderAL(int cost) {
        drunk = true;
        this.amont += cost;
    }
    
}

public class Class_primer__static_member_new {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        ArrayList<Person> persons = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int old = sc.nextInt();
            if (old >= 20) {
                persons.add(new Adalt());
            } else {
                persons.add(new Person());
            }
        }
        
        for (int j = 0; j < k; j ++){
            int index = sc.nextInt() - 1;
            String s = sc.next();
            
            if (s.equals("0")) {
                persons.get(index).orderAL();
            } else if (s.equals("A")) {
                System.out.println(persons.get(index).amont);
                persons.get(index).left();
            } else {
                int o = sc.nextInt();
                if (s.equals("softdrink")) {
                    persons.get(index).orderSoft(o);
                } else if (s.equals("food")) {
                    persons.get(index).orderFood(o);
                } else {
                    persons.get(index).orderAL(o);
                }
            }
        } 
        
        System.out.println(Person.left);
        
        
    }
}