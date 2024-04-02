public class Fibonacci {
    public static void main (String[] args) {
        int f1 = 0, f2 = 1, f3 = 0, limit = Integer.parseInt(args[0]);
        if (limit == 1) {
            System.out.print(f1);
        } else if (limit == 2) {
            System.out.print(f2);
        } else {
            // System.out.print(f1 + " " + f2);
            for (int i = 0; i * 2 < limit; i++) {
                if (i == 0) {
                    System.out.print(f1 + ", " + f2);
                }
                else {
                    System.out.print(", " + f1 + ", " + f2);
                }
                f1 = f1 + f2;
                f2 = f2 + f1;
            }
        }
    }
}