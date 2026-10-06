import javax.swing.JOptionPane;

public class assignment3p3 {
    public static void main(String[] args){

        double nsat = Double.parseDouble(JOptionPane.showInputDialog("Enter NSAT score: "));
        double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter parents' monthly salary: "));
        double entrance = Double.parseDouble(JOptionPane.showInputDialog("Enter entrance exam score: "));

        double average = (nsat + entrance) / 2;
        String status;
        if (salary >10000 || nsat <90 || entrance <85){
            status =  "REJECTED";
        }
        else if (salary <=3500 && average >=91) {
          status = "ACCEPTED";
        }
        else {
           status = "FOR FURTHER STUDY";
        }
        JOptionPane.showMessageDialog(null, "Average Score: " + String.format("%.2f", average) + "\nApplication Status: " + status);
        }
    }