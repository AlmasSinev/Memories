public class Main {
    public static void main(String[] args) {

        System.out.printf("This is a format string %d", 123);


        System.out.println(add(10));
        System.out.println(add(10, 5));
        System.out.println(add(10, 5, 2));

    }

    public static int add(int a) {
        System.out.println("Overloaded method #1");
        return a + a;
    }

    public static int add(int a, int b) {
        System.out.println("Overloaded method #2");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("Overloaded method #3");
        return a + b + c;
    }
}