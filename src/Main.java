import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name ?");
        String name = sc.nextLine();

        System.out.println("How old are you?");
        int age = sc.nextInt();

        System.out.println("Hello " + name + "! Your age is " + age + ".");

    }
}
