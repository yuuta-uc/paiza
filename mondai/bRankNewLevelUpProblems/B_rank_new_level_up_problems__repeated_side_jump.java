// https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__repeated_side_jump

import java.util.*;
public class B_rank_new_level_up_problems__repeated_side_jump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1 ≦ N ≦ 250,000,000 なのでlong型
		long n = sc.nextLong();
		long x = sc.nextLong();
		long k = sc.nextLong();

        if(k % 4 == 3) {
			System.out.println(x*2*((k-4*n) / 4) + x);
		} else {
            System.out.println(x*2*((k-4*n) / 4));
		}
        
    }
}