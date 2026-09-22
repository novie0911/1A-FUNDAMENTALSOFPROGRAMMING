import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class fourthjava {
    public static void main(String[] args) {

        //The name or path of the file you want to create or overwrite
        String filepath = "reglos.txt";
        //wrap a filewriter inside a bufferwriter
        // the try-with-resources block ensure the files is closed and saved automatically
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath))) {

            //write test to the file
            writer.write("this is the first line of text");

            writer.newLine();
            writer.write("This is the second line of the text");
            writer.newLine();
            writer.write("BufferedWriter makes writing fast and efficient.");
            System.out.println("Data successfully written to the file!");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file.");
            e.printStackTrace();

        }
    }

}
