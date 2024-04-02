import java.util.*;

public class ForEach {
    public static void main(String[] args) {
        Random agent = new Random(47);
        int i = 0;
        String a = "random world";

        char[] test = a.toCharArray();

        for (int j: test) {
            System.err.println((char)j);
        }

        float f[] = new float[10];

        for (; i < 10; i++) {
            f[i] = agent.nextFloat();
        }

        for (float x: f) {
            System.out.println(x);
        }
    }
}