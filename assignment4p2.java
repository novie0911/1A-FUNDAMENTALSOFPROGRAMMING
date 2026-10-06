import java.util.Scanner;

public class assignment4p2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter height in cm: ");
        int height = input.nextInt();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter citizenship code (C/N): ");
        char citizenship = input.next().charAt(0);

        System.out.print("Enter recomendee code (R/N): ");
        char recomendee = input.next().charAt(0);

        if (recomendee == 'R' ||
                (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C')) {
            System.out.println("ACCEPTED");
        } else {
            System.out.println("REJECTED");
        }
        input.close();
    }
}
