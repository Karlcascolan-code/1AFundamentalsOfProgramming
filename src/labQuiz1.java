import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class labQuiz1 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter your Birth Year: ");
            String yearInput = dataIn.readLine();
            int year = Integer.parseInt(yearInput);

            int age = 2026 - year;

            System.out.println("Your were born last " + year);

            System.out.print("You are now " + age + " yrs old.");
        } catch (Exception e) {
            System.err.println("Error reading input stream");
        }
    }
}
