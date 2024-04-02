
class Sleezy {
	float a;
}

public class Referencing {
	public static void main(String[] args) {
		Sleezy first = new Sleezy();
		Sleezy second = new Sleezy();
		first.a = 21.2f;
		second.a = 56.2f;
		System.out.println("first: " + first.a + "second: " + second.a);
		second = first;
		System.out.println("first: " + first.a + "second: " + second.a);
		second.a = 44.4f;

		System.out.println("first: " + first.a + "second: " + second.a);
	}
}
