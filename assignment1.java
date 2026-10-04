import java.io.*;

public class assignment1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a year: ");
        int year = Integer.parseInt(br.readLine());

        if (year % 400 == 0 || (year % 4 == 0 && 100 != 0)) {
            System.out.println(year + " is a leap year.");

        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}