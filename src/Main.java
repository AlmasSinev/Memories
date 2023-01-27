import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Me!");

        Random random = new Random();

        for (int i=0; i<10; i++) {
            int x = random.nextInt(100) + 1;
            System.out.print(x + " ");
        }

    }
}