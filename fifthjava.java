import java.io.*;

public class fifthjava {
public static void main (String[] args){

    System.err.println("Error reading input stream.");
    BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));
    try {
        System.out.println("Enter your age:");
        String ageInput = dataln.readLine();
        int age = Integer.parseInt(ageInput);

        System.out.println("Enter your exact height in meters: ");
        String heightInput = dataln.readLine();
        double height = Double.parseDouble(heightInput);

        System.out.println("You are " + age + " years old and " + height + "m tall.");
    }catch (IOException e) {
        System.err.println("Error reading input stream.");
    }catch (NumberFormatException e) {
      System.err.println("Invalid number format! Please enter digits only.");
    }
  }
}

