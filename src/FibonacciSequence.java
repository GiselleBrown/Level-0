
public class FibonacciSequence {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 1;
		int d = 2;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < 100; i++) {
			a = a + b;
			System.out.println(a);
			b = b + a;
			System.out.println(b);
		}
	}
}
