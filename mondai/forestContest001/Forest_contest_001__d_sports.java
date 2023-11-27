//https://paiza.jp/works/mondai/forest_contest_001/forest_contest_001__d_sports

import java.util.*;

public class Forest_contest_001__d_sports {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
     
		switch(line) {
			case "baseball":
			  System.out.println(9);
			break;
			case "soccer":
			  System.out.println(11);
			break;
			case "rugby":
			  System.out.println(15);
			break;
			case "basketball":
			  System.out.println(5);
			break;
			case "volleyball":
			  System.out.println(6);
			break;
		}
    }
}