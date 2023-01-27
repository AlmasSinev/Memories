import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<>();

        food.add("pizza");
        food.add("ramen");
        food.add("sushi");

        for (String f : food) {
            System.out.println(f);
        }


    }
}
