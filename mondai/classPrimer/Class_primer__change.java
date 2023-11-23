package paiza.mondai.classPrimer;
import java.util.*;

class Person {
    int old;
    String birth;
    String name;
    String state;
    
    void updateName(String name) {
        this.name = name;
    }
}

public class Class_primer__change {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        ArrayList<Person> persons = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            Person p = new Person();
            
            p.name = sc.next();
            p.old = sc.nextInt();
            p.birth = sc.next();
            p.state = sc.next();
            
            persons.add(p);
            
        }
        
        for (int m = 0; m < k; m++) {
            int num = sc.nextInt();
            String updateName = sc.next();
            
            persons.get(num - 1).updateName(updateName);
        }
        
        for (int j = 0; j < persons.size(); j++) {
            System.out.println(persons.get(j).name + " " + persons.get(j).old + " " + persons.get(j).birth + " " + persons.get(j).state);
        }
		sc.close();
    }
}
