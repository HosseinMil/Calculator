// Dev = Hossein_Mil
// Email = iho3ein2000@outlook.com

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String math = JOptionPane.showInputDialog("Select one of this process :  \n" +
                "1) plus \n" +
                "2) Minus \n" +
                "3) Multiplication \n" +
                "4) Division \n" +
                "5) Power \n" +
                "6) Radical \n");

        if (math.equals("1")) {
            double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
            double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
            double z = X + Y ;
            JOptionPane.showMessageDialog(null, z);
        }
        else if (math.equals("2")) {
            double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
            double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
            double z = X - Y ;
            JOptionPane.showMessageDialog(null, z);
        }
        else if (math.equals("3")) {
            double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
            double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
            double z = X * Y ;
            JOptionPane.showMessageDialog(null, z);
        }
        else if (math.equals("4")) {
            double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
            double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
            double z = X / Y ;
            JOptionPane.showMessageDialog(null, z);
        }
        else if (math.equals("5")) {
            double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
            double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
            double z = Math.pow(X, Y);
            JOptionPane.showMessageDialog(null, z);
        }
        else if (math.equals("6")) {
            double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
            double z = Math.sqrt(X);
            JOptionPane.showMessageDialog(null, z);
        }
        

    }
}
