import java.util.*;
public class Test_loop {
    public static void main(String[] args) {
        int i, result;
        String splitter;
        
        result = 1;
        splitter = "1260";

        for (i = 0; (splitter.length() % 2 == 0) && i < splitter.length() && splitter.length() >= 4; i += 2) {
            result = result * Integer.parseInt(splitter.substring(i, i + 2));
            System.out.println(result);
        }
    }
}
for (int num = 1000; num <= 9999; num++) {
    String numString = String.valueOf(num);
    int numLength = numString.length();
    
    for (int i = 10; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            int factor1 = i;
            int factor2 = num / i;
            
            String factorString = String.valueOf(factor1) + String.valueOf(factor2);
            
            if (factorString.length() == numLength) {
                System.out.println(num + " = " + factor1 + " * " + factor2);
            }
        }
    }
}