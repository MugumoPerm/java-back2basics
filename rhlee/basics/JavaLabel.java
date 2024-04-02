public class JavaLabel {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        for (; i < 20; i++){
            outer:
            for  (j = 0; j < 10; j++) {
                if (j == 3) {
                    System.out.println("Outer continuation");
                    continue outer;
                }
            }
        }
    }
}
