import java.util.Scanner;
import javax.swing.JOptionPane;

public class labQuiz2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = "";
        int amount;

        String hello = "Welcome to Adobo Cooking Show";;
        JOptionPane.showMessageDialog(null, hello);

        name = JOptionPane.showInputDialog("Enter your name");

        amount = Integer.parseInt(JOptionPane.showInputDialog("How many kilo of pork will you cook"));
        double soyRatio = 0.5 * amount;
        double vinegarRatio = 0.33 * amount;

        String msg = "The ratio of soy sauce for " + amount + "kg is " + soyRatio + "\n" + "The ratio of vinegar for " + amount + "kg is " + vinegarRatio;
        JOptionPane.showMessageDialog(null, msg);
    }
}
