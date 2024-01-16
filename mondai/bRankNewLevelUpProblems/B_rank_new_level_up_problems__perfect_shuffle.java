//https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__perfect_shuffle

import java.util.*;

public class B_rank_new_level_up_problems__perfect_shuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
        String[] a = {"S","H","D","C"};
        String[] c = new String[52];
		int count = 0;

        for(int i = 0; i < a.length; i++){
			for(int j = 1; j <= 13; j++ ){
				String s = String.format("%s_%d",a[i],j);
				c[count] = s;
				count++;
			}
		}

        for(int i = 0; i < n; i++) {
		    c = shuffle(c);
		}

		for(String s : c) {
			System.out.println(s);
		}

    }

	public static String[] shuffle(String[] c) {
		String[] top = new String[26];
		String[] bottom = new String[26];

		for(int i = 0; i < 26; i++) {
			top[i] = c[i];
		}

		for(int i = 0; i < 26; i++) {
			bottom[i] = c[i+26];
		}

		int count = 0;
		int[] d = new int[52];
		for(int i = 0; i < 52; i++) {
			if(i % 2 == 0) {
				d[i] = count;
			} else {
				d[i] = count;
				count++;
			}
		}

		for(int i = 0; i < 52; i++) {
			if(i % 2 ==0){
				c[i] = top[d[i]];
			} else {
				c[i] = bottom[d[i]];
			}
		}
        
		return c;
	}
}