import java.util.Random;

public class IfElse {

	static int generator() {
		Random gen = new Random();
		return gen.nextInt(25);
	}

	static void printer(String ToPrint) {
		System.out.println(ToPrint);
	}

	public static void main(String[] args) {
		int i = 0, previous = 0;

		do {
			int current = generator();
			if (current > previous) {
				printer(Integer.toString(current) + "is greater than previous");
					}
			else {
				printer(Integer.toString(current) + "is less than previous");
			}
			previous = current;
			i++;
		} while (i < 25);
	}
}
