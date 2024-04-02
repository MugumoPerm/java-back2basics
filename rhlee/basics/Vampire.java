public class Vampire {
    public static void main(String[] args) {
        int i, j, result, extract;

        i = j = result = extract = 0;
        while (i < 20000) {
            String splitter = Integer.toString(i);
            result = 1;
            
            for (j = 0; (splitter.length() % 2 == 0) && j < splitter.length() && splitter.length() >= 4; j += 2) {
                extract = Integer.parseInt(splitter.substring(j, j + 2));
                result = result * extract;
            }
            if (result == i) {
                System.out.println("vampire number " + result);
            }
            i++;
        }
    }
}