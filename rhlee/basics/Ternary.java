import java.util.Random;

public class Ternary {
    static int generator() {
        Random gen = new Random();
        int num = gen.nextInt(30);
        return num;
    }

    public static void main(String[] args) {
        int i, prev, current;

        i = prev = current = 0;
        String message = null;
        do {
            current = generator();
            message = current > prev ? "Generated is greator" : "Generated is lesser";
            System.out.println(message);
            prev = current;
            i++;
        } while(i <= 10);
    }
}