import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter ypur height: "));
        JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");

    }
}
