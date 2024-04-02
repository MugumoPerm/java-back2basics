public class fibbo {
    public static void main(String[] args) {
        int f1, f2, i;

        f1 = 0;
        f2 = 1;

        for (i = 0; i < Integer.parseInt(args[0]); i++) {
            System.out.println("f1 = " + f1);
            System.out.println("f2 = " + f2);

            f1 = f1 + f2;
            f2 = f1 + f2;
        }
    }
}