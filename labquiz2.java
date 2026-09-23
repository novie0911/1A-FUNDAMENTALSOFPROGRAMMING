import javax.swing.JOptionPane;

public class labquiz2 {
    public static void main(String[] args){
        String msg = "";
        JOptionPane.showMessageDialog(null, msg + "Welcome to Adobo Cooking Show");
        String name = "";
        name = JOptionPane.showInputDialog("Enter your name:");
        String kilo;
        kilo = JOptionPane.showInputDialog("How many kilo of pork will you cook?");
        String message= "";
        JOptionPane.showMessageDialog(null, msg + "The ratio of soy sauce for 1.5 kg is = 3/4 cup");
        JOptionPane.showMessageDialog(null, msg + "The ratio of vinegar for 1.5 kg is = 1/2 cup");

    }
}