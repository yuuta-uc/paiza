//https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__leet_paiza

import java.util.*;
public class B_rank_new_level_up_problems__leet_paiza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
		String leet = s.replace("4","a")
		               .replace("@","a")
					   .replace("1","i")
					   .replace("!","i")
					   .replace("2","z");


		if(s.contains("paiza")) {
			System.out.println("paiza");
		} else if (leet.contains("paiza")) {
			System.out.println("leet");
		} else {
			System.out.println("nothing");
		}		
        
    }
}