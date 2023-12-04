//https://paiza.jp/works/mondai/class_primer/class_primer__robot_move

import java.util.*;

class Robot {
    int w;
    int h;
    int level;
    
    Robot(int w, int h, int l) {
        this.level = l;
        this.h = h;
        this.w = w;
    }

    int getLevel() {
        return this.level;
    }

    int getH() {
        return this.h;
    }

    int getW() {
        return this.w;
    } 
    
    void go(String s, int level) {
        int d = 1;

        switch (level) {
            case 1:
                d = 1;
            break;
            case 2:
                d = 2;
            break;
            case 3:
                d = 5;
            break;
            case 4:
                d = 10;
            break;
        }
        switch(s) {
            case "N":
                this.h -= d;
            break;
            case "S":
                this.h += d;
            break;
            case "E":
                this.w += d;
            break;
            case "W":
                this.w -= d;
            break;
        }

    }

	void levelUp(int w, int h, int boxW, int boxH) {
        if (boxH == h && boxW == w) {
          this.level ++;
        }
    }
    
}

public class Class_primer__robot_move {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
             
        int[][] boxes = new int[10][];      
        for (int i = 0; i < 10; i++) {
            int boxw = sc.nextInt();
            int boxh = sc.nextInt();
            boxes[i] = new int[2];
            boxes[i][0] = boxw;
            boxes[i][1] = boxh;
        }   
        
        Robot[] robots = new Robot[n];
        for (int j = 0; j < n; j++) {
            int boxW = sc.nextInt();
            int boxH = sc.nextInt();
            int l = sc.nextInt();
            robots[j] = new Robot(boxW,boxH,l);
        }

        for (int m = 0; m < k; m++) {
            int index = sc.nextInt();
            String di = sc.next();

            robots[index-1].go(di,robots[index-1].getLevel());
            for (int[] o : boxes) {
                robots[index-1].levelUp(robots[index-1].getW(),robots[index-1].getH(),o[0],o[1]);
            }
        }

        for (Robot r : robots) {
            System.out.println(r.w + " "  + r.h + " " + r.level);
        }

    }
}