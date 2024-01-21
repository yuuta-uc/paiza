//https://paiza.jp/works/mondai/class_primer/class_primer__inheritance

import java.util.*;

class Person {
    //コンスラクタでもどちらでもよい
    int amount = 0;

    void orderFood(int cost) {
        this.amount += cost;
    }

    void orderDrink(int cost) {
        this.amount += cost;
    }

    void orderAl(int cost) {}
}

class Adult extends Person {
    boolean isOrderAL = false;

    void orderAl(int cost) {
        isOrderAL = true;
        this.amount += cost;
    }

    void orderFood(int cost) {
        if(isOrderAL) {
            cost -= 200;
        }    
        
        super.orderFood(cost);
        
    }

}

public class Class_primer__inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        ArrayList<Person> persons = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int old = sc.nextInt();
            if(old >= 20) {
                Person p = new Adult();
                persons.add(p);
            } else {
                Person p = new Person();
                persons.add(p);
            }
        }

        for(int i = 0; i < k; i++){
            int num = sc.nextInt()-1;
            String order = sc.next();
            int cost = sc.nextInt();
            Person custamer =  persons.get(num);
            
            switch(order) {
                case "food":
                    custamer.orderFood(cost);
                break;
                case "alcohol":
                    custamer.orderAl(cost);
                break;
                case "softdrink":
                    custamer.orderDrink(cost);
                break;
            }
        }
        
        for(Person p : persons) {
            System.out.println(p.amount);
        }
    }
}


