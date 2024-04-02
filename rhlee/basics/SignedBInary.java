public class SignedBInary {
	public static void main(String[] args) {
		final int a = 0x15;
		int i = 0;
		System.out.println(Integer.toBinaryString(a));

		int value_1 = a >>> 1;

		int value_2 = a >>> 2;

		int value_3 = a >>> 3;

		int value_4 = a >>> 4;

		int[] values = {value_1, value_2, value_3, value_4};

		System.out.println(values.length);

		for (i = 0; i < values.length; i++) {
			System.out.println(Integer.toBinaryString(values[i]));
		}

		char b = 'a';

		System.out.println(b  - 48);

		System.out.println(Integer.toBinaryString(b));
	}
}
