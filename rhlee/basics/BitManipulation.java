public class BitManipulation {
	public static void main(String[] args) {
		final int value_1 = 0xAA;
		final int value_2 = 0x55;

		System.out.println(Integer.toBinaryString(value_1) + "\n" + Integer.toBinaryString(value_2));


		int result_1 = value_1 & value_2;
		System.out.println("Value_1 & value_1: " + Integer.toBinaryString(result_1) + "which is number" + result_1);
		int result_2 = value_1 | value_2;
		System.out.println("value_1 | value_1: " + Integer.toBinaryString(result_2) + "which is number" + result_2);
		int result_3 = value_1 ^ value_2;
		System.out.println("value_1 ^ value_1: " + Integer.toBinaryString(result_3) + "which is number" + result_3);
	}
}
