import java.util.Random;

public class Ex3 {

    public static void getRandomNumbers() {
        System.out.println("Hello Me!");

        Random random = new Random();

        for (int i=0; i<10; i++) {
            int x = random.nextInt(100) + 1;
            System.out.print(x + " ");
        }
    }
}
