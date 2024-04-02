import java.util.*;
public class PrimaryNumbers {
    static boolean prime_finder(int num) {
        if (num < 2) {
            return false;
        }
        int i = 2, limit = (int)Math.pow(num, 0.5);
        for (; i <= limit; i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Random gen = new Random();
        int i = 0, current = 0;
        String message;

        for (; i < 20; i++) {
            current = gen.nextInt(50);
            message = prime_finder(current) == false ? "is not a prime" : "is a prime";
            System.out.println(Integer.toString(current) + message);
        }
    }
}