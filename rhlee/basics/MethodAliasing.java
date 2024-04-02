class Letter {
	char c;
}

public class MethodAliasing {
	static void f(Letter a) {
		a.c = 'z';
	}

	public static void main(String[] args) {
		Letter ch = new Letter();

		ch.c = 'a';

		System.out.println("1.ch: " + ch.c);

		f(ch);

		System.out.println("2.ch: " + ch.c);
	}
}
