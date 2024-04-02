public class Vampire {
	public static void main(String[] args){
		int i, j, result, extract;
		i = j = 0;
		while (i < 20000){
			String splitter = Integer.toString(i);
			result = 1;

			for (j = 0; (splitter.length() % 2 == 0) && j < splitter.length(); j += 2){
				extract = Integer.parseInt(splitter.substring(j, j+2));
				result *= extract;
			}
			if (result == i){
				System.out.println("Vampire number: " + splitter);
			}
			i++;
		}
	}
}
