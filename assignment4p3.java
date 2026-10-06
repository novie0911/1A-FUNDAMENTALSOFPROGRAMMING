import javax.swing.JOptionPane;

public class assignment4p3 {
    public static void main(String[] args){

        int height = Integer.parseInt(
                JOptionPane.showInputDialog("Enter height in cm: "));
        int age = Integer.parseInt(
                JOptionPane.showInputDialog("Enter age: "));
        char citizenship = JOptionPane.showInputDialog(
                "Enter citizenship code (C/N): ").charAt(0);
        char recomendee = JOptionPane.showInputDialog("Enter recomendee code (R/N)").charAt(0);

        if (recomendee == 'R' ||
                (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C')) {
           JOptionPane.showMessageDialog(null, "ACCEPTED");
        } else {
            JOptionPane.showMessageDialog(null,"REJECTED");
        }
    }
}
