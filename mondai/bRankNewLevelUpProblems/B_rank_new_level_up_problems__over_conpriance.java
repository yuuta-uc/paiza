//https://paiza.jp/works/mondai/b_rank_new_level_up_problems/b_rank_new_level_up_problems__over_conpriance

import java.util.*;
public class B_rank_new_level_up_problems__over_conpriance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
		String s = sc.next();
        
		int d;
		String first;
		String end;
		if(s.length() % 2 == 0) {
            d = (s.length() / 2);
			first = s.substring(0,d);
			end = s.substring(d,s.length());
		} else {
			d = (s.length() / 2)+1;
			first = s.substring(0,d);
			end = s.substring(d-1,s.length());
		}
		
        for(int i = 0; i < n; i++) {
			String v = sc.next();
			int vd;
			String vfirst;
			String vend;
			if(v.length() % 2 == 0) {
				vd = (v.length() / 2);
				vfirst = v.substring(0,vd);
				vend = v.substring(vd,v.length());
			} else {
				vd = (v.length() / 2)+1;
				vfirst = v.substring(0,vd);
				vend = v.substring(vd-1,v.length());
			}
			
			if(v.equals(s)) {
				System.out.println("banned");
			} else if(s.length() == v.length() && vfirst.equals(first)) {
				StringBuilder sb = new StringBuilder();
				for(int j = 0; j < vfirst.length(); j++){
					sb.append("x");
				}
				if(v.length() % 2 == 0) {
				  sb.append(vend);
				} else {
				  vend = vend.substring(1,vend.length());
				  sb.append(vend);    
				}
				
				System.out.println(sb);
			} else if(s.length() == v.length() && vend.equals(end)) {
				StringBuilder sb = new StringBuilder();
				if(v.length() % 2 == 0) {
				  sb.append(vfirst);
				} else {
				  vfirst = vfirst.substring(0,vfirst.length()-1);
			      sb.append(vfirst);
				}
				for(int j = 0; j < vend.length(); j++){
					sb.append("x");
				}
				System.out.println(sb);
			} else {
			    System.out.println(v);
			}
		}

    }
}