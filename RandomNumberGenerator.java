import java.util.Random;

public class RandomNumberGenerator {

    public int getRandomNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("min must be less than or equal to max");
        }
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        int randomNumber = randomNumberGenerator.getRandomNumber(1, 100);
        System.out.println("Random number between 1 and 100: " + randomNumber);
    }
}
