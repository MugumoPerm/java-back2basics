import java.util.*;
public class Switch {
    public static void main (String[] args) {
        Random num = new Random();
        int i = 0, r = 0;
        label:
        for (; i < 10; i++) {
            r = num.nextInt(9);

            switch (r) {
                case 1:
                    System.out.println("Dark monday");
                    continue label;                  
                case 2:
                    System.out.println("Tuesdays with molly");
                case 3:
                    System.out.println("Woman Crush Wednesday");
                case 4:
                    System.out.println("Throw back thursday");
                case 5:
                    System.out.println("Freaky Friday");
                case 6:
                    System.out.println("The weekend is here");
            
                default:
                    break;
            }
        }
    }
}