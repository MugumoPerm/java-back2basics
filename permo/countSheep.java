public class countSheep {

	static String countingSheep(int num) {

		String sheep = "";

		for (int i=1; i<=num; i++) {
	
			sheep += (i + " sheep...");
		}
		return sheep;
	}

	public static void main (String[] args) {
		System.out.println(countingSheep(3));
	}

}

