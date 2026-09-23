import java.io.*;

public class labquiz1 {
    public static void main(String[] args) {

        BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter your birthyear: ");
            String yearInput = dataln.readLine();
            int year = Integer.parseInt(yearInput);

            int age = 2026 - year;
            System.out.println("You are born last " + year + ".");
            System.out.println("You are now " + age + " years old. ");

        } catch (IOException e) {
            System.err.print("Error reading input stream. ");
        }
    }
}

