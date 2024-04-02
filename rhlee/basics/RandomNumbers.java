import java.util.Random;

class CoinFlip {
    Random no = new Random(); // Create a new instance of the Random class

    int coinSide = no.nextInt(100); // Generate a random number (0 or 1)
}

public class RandomNumbers {
    public static void main(String[] args) {
        int i = 0;
        CoinFlip coin = new CoinFlip();

        for (i = 0; i <= 5; i++) {
            System.out.println(coin.coinSide);
        }
    }
}
