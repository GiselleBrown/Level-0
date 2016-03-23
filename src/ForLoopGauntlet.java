
public class ForLoopGauntlet {
	public static void main(String[] args) {
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
		for (int f = 100; f >= 0; f--) {
			System.out.println(f);
		}
		for (int d = 0; d < 100; d++) {
			if (d % 2 == 0) {
				System.out.println(d);
			}
		}
		for (int e = 1; e < 100; e++){
			if(e % 2 == 1){
				System.out.println(e);
			}
		}
		for (int g = 1; g < 501; g++) {
		if(g % 2 == 0)	{
			System.out.println("even");
		}else if(g % 2 == 1){
			System.out.println("odd");
		}
		}
		for (int h = 0; h < 778; h+=7) {
			System.out.println(h);
		}
		for (int t = 0;t < 3; t++) {
			for (int u = 0; u < 3; u++) {
				System.out.println(t + " " + u);
			}
		}
		int age = -1;
		for (int n = 2002; n < 2017; n++) {
			age++;
			System.out.println("In " + n + " I was " + age);
		}
		int b = 1;
		for (int i1 = 0; i1 < 3; i1++) {
			System.out.println();
			for (int i = 0; i < 3; i++) {
				System.out.print(b++ );
			}
		}
		int k = 1;
		for (int i1 = 0; i1 < 10; i1++) {
			System.out.println();
			for (int i = 0; i < 10; i++) {
				System.out.print(k++ + " ");
			}
		}
		for (int i = 1; i < 7; i++) {
			for (int l = 1; l < i; l++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		int a = 100;
		for (int i = 0; i < 101; i++) {
			System.out.println(a);
			a--;
		}
	}
}
