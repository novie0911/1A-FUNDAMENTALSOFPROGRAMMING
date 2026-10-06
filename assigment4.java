import java.io.*;

public class assigment4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter height in cm: ");
        int height = Integer.parseInt(br.readLine());

        System.out.print("Enter age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.print("Enter citizenship code (C/N): ");
        char citizenship = br.readLine().charAt(0);

        System.out.print("Enter recomendee code (R/N): ");
        char recomendee = br.readLine().charAt(0);

        if (recomendee == 'R' ||
                (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C')) {
            System.out.println("ACCEPTED");
        } else {
            System.out.println("REJECTED");
        }
    }
}
