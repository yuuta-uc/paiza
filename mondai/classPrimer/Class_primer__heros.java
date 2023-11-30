//https://paiza.jp/works/mondai/class_primer/class_primer__heros
import java.util.*;

class Hero {
  int l;
  int h;
  int a;
  int d;
  int s;
  int c;
  int f;

  Hero(int l, int h, int a, int d, int s, int c, int f) {
    this.l = l;
	this.h = h;
	this.a = a;
	this.d = d;
	this.s = s;
	this.c = c;
	this.f = f;
  }

  void levelUp(int h, int a, int d, int s, int c, int f) {
	this.l += 1;
	this.h += h;
	this.a += a;
	this.d += d;
	this.s += s;
	this.c += c;
	this.f += f;
  }

  void muscleTraining(int h, int a) {
	this.h += h;
	this.a += a;
  }

  void running(int d, int s) {
	this.d += d;
	this.s += s;
  }

  void study(int c) {
	this.c += c;
  }

  void pray(int f) {
	this.f += f;
  }

}


public class Class_primer__heros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		Hero[] heros = new Hero[n];
		for (int i = 0; i < n; i++) {
			int l = sc.nextInt();
			int h = sc.nextInt();
			int a = sc.nextInt();
			int d = sc.nextInt();
			int s = sc.nextInt();
			int c = sc.nextInt();
			int f = sc.nextInt();
			heros[i] = new Hero(l,h,a,d,s,c,f);
		}

        for (int j = 0; j < k; j++) {
			int index = sc.nextInt() - 1;
			String act = sc.next();

			switch(act) {
			    case "levelup":
					int h = sc.nextInt();
					int a = sc.nextInt();
					int d = sc.nextInt();
					int s = sc.nextInt();
					int c = sc.nextInt();
					int f = sc.nextInt();
					heros[index].levelUp(h,a,d,s,c,f);
				break;
				case "muscle_training":
					int newh = sc.nextInt();
					int newa = sc.nextInt();
					heros[index].muscleTraining(newh, newa);
				break;
				case "running":
					int newd = sc.nextInt();
					int news = sc.nextInt();
					heros[index].running(newd, news);
				break;
				case "study":
					int newc = sc.nextInt();
					heros[index].study(newc);
				break;
				case "pray":
					int newf = sc.nextInt();
					heros[index].pray(newf);
				break;
			}
		}

		for (int m = 0; m < n; m++) {
			System.out.println(
				heros[m].l + " " +
				heros[m].h + " " +
				heros[m].a + " " +
				heros[m].d + " " +
				heros[m].s + " " +
				heros[m].c + " " +
				heros[m].f 
			);
		}

	}
}