
public class ForLoopGauntlet {
public static void main(String[] args) {
	for (int i = 0; i < 101; i++) {
		System.out.println(i);
	}
	for (int f = 100; f >= 0; f--) {
		System.out.println(f);
	}
	for (int d = 0; d < 100; d++) {
		if(d%2 == 0){
			System.out.println(d);
		}
	}
}
}
