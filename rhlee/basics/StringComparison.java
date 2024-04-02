public class StringComparison {
	static void compare(String a, String b) {
		System.out.println(a == b);
		System.out.println(a != b);

		System.out.println(a.equals(b));
	}

	public static void main(String[] args) {
		compare("Hellow", "world");
	}
}
