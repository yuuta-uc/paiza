import java.util.*;
public class B_rank_new_level_up_problems__get_one {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        
        String[][] grid = new String[h][w];
        
        for(int i = 0; i < h; i++) {
            String row = sc.next();
            String[] rows = new String[w];
            for(int j = 0; j < row.length(); j++) {
                String item = String.valueOf(row.charAt(j));
                rows[j] = item;
            }
            grid[i] = rows;
        }
        
        int y = sc.nextInt();
        int x = sc.nextInt();
        
        if(grid[y][x].equals("#")) {
			grid[y][x] = ".";
		} else {
			grid[y][x] = "#";
		}
        
        
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                if(j == w-1) {
                    System.out.println(grid[i][j]);
                } else {
                    System.out.print(grid[i][j]);
                }
            }
        }
    
        
    }
}