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
            String t = JOptionPane.showInputDialog("Enter the number of the variable :  (2-9)");
            if (t.equals("2")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double z = X + Y ;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("3")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double z = X + Y + a ;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("4")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double b = Double.parseDouble(JOptionPane.showInputDialog("b : "));
                double z = X + Y + a + b ;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("5")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double b = Double.parseDouble(JOptionPane.showInputDialog("b : "));
                double c = Double.parseDouble(JOptionPane.showInputDialog("c : "));
                double z = X + Y + a + b + c ;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("6")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double b = Double.parseDouble(JOptionPane.showInputDialog("b : "));
                double c = Double.parseDouble(JOptionPane.showInputDialog("c : "));
                double d = Double.parseDouble(JOptionPane.showInputDialog("d : "));
                double z = X + Y + a + b + c + d ;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("7")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double b = Double.parseDouble(JOptionPane.showInputDialog("b : "));
                double c = Double.parseDouble(JOptionPane.showInputDialog("c : "));
                double d = Double.parseDouble(JOptionPane.showInputDialog("d : "));
                double e = Double.parseDouble(JOptionPane.showInputDialog("e : "));
                double z = X + Y + a + b + c + d + e ;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("8")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double b = Double.parseDouble(JOptionPane.showInputDialog("b : "));
                double c = Double.parseDouble(JOptionPane.showInputDialog("c : "));
                double d = Double.parseDouble(JOptionPane.showInputDialog("d : "));
                double e = Double.parseDouble(JOptionPane.showInputDialog("e : "));
                double f = Double.parseDouble(JOptionPane.showInputDialog("f : "));
                double z = X + Y + a + b + c + d + e + f ;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("9")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double b = Double.parseDouble(JOptionPane.showInputDialog("b : "));
                double c = Double.parseDouble(JOptionPane.showInputDialog("c : "));
                double d = Double.parseDouble(JOptionPane.showInputDialog("d : "));
                double e = Double.parseDouble(JOptionPane.showInputDialog("e : "));
                double f = Double.parseDouble(JOptionPane.showInputDialog("f : "));
                double g = Double.parseDouble(JOptionPane.showInputDialog("g : "));
                double z = X + Y + a + b + c + d + e + f + g ;
                JOptionPane.showMessageDialog(null, z);
            }
        }
        else if (math.equals("2")) {
            String t = JOptionPane.showInputDialog("Enter the number of the variable :  (2-9)");

            if (t.equals("2")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double z = X - Y;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("3")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double z = X - Y - a ;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("4")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double b = Double.parseDouble(JOptionPane.showInputDialog("b : "));
                double z = X - Y - a - b ;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("5")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double b = Double.parseDouble(JOptionPane.showInputDialog("b : "));
                double c = Double.parseDouble(JOptionPane.showInputDialog("c : "));
                double z = X - Y - a - b - c ;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("6")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double b = Double.parseDouble(JOptionPane.showInputDialog("b : "));
                double c = Double.parseDouble(JOptionPane.showInputDialog("c : "));
                double d = Double.parseDouble(JOptionPane.showInputDialog("d : "));
                double z = X - Y - a - b - c - d ;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("7")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double b = Double.parseDouble(JOptionPane.showInputDialog("b : "));
                double c = Double.parseDouble(JOptionPane.showInputDialog("c : "));
                double d = Double.parseDouble(JOptionPane.showInputDialog("d : "));
                double e = Double.parseDouble(JOptionPane.showInputDialog("e : "));
                double z = X - Y - a - b - c - d - e ;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("8")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double b = Double.parseDouble(JOptionPane.showInputDialog("b : "));
                double c = Double.parseDouble(JOptionPane.showInputDialog("c : "));
                double d = Double.parseDouble(JOptionPane.showInputDialog("d : "));
                double e = Double.parseDouble(JOptionPane.showInputDialog("e : "));
                double f = Double.parseDouble(JOptionPane.showInputDialog("f : "));
                double z = X - Y - a - b - c - d - e - f ;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("9")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double b = Double.parseDouble(JOptionPane.showInputDialog("b : "));
                double c = Double.parseDouble(JOptionPane.showInputDialog("c : "));
                double d = Double.parseDouble(JOptionPane.showInputDialog("d : "));
                double e = Double.parseDouble(JOptionPane.showInputDialog("e : "));
                double f = Double.parseDouble(JOptionPane.showInputDialog("f : "));
                double g = Double.parseDouble(JOptionPane.showInputDialog("g : "));
                double z = X - Y - a - b - c - d - e - f  - g ;
                JOptionPane.showMessageDialog(null, z);
            }
        }
        else if (math.equals("3")) {
            String t = JOptionPane.showInputDialog("Enter the number of the variable :  (2-9)");

            if (t.equals("2")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double z = X * Y ;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("3")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double z = X * Y * a ;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("4")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double b = Double.parseDouble(JOptionPane.showInputDialog("b : "));
                double z = X * Y * a * b ;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("5")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double b = Double.parseDouble(JOptionPane.showInputDialog("b : "));
                double c = Double.parseDouble(JOptionPane.showInputDialog("c : "));
                double z = X * Y * a * b * c ;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("6")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double b = Double.parseDouble(JOptionPane.showInputDialog("b : "));
                double c = Double.parseDouble(JOptionPane.showInputDialog("c : "));
                double d = Double.parseDouble(JOptionPane.showInputDialog("d : "));
                double z = X * Y * a * b * c * d ;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("7")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double b = Double.parseDouble(JOptionPane.showInputDialog("b : "));
                double c = Double.parseDouble(JOptionPane.showInputDialog("c : "));
                double d = Double.parseDouble(JOptionPane.showInputDialog("d : "));
                double e = Double.parseDouble(JOptionPane.showInputDialog("e : "));
                double z = X * Y * a * b * c * d * e ;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("8")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double b = Double.parseDouble(JOptionPane.showInputDialog("b : "));
                double c = Double.parseDouble(JOptionPane.showInputDialog("c : "));
                double d = Double.parseDouble(JOptionPane.showInputDialog("d : "));
                double e = Double.parseDouble(JOptionPane.showInputDialog("e : "));
                double f = Double.parseDouble(JOptionPane.showInputDialog("f : "));
                double z = X * Y * a * b * c * d * e * f ;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("9")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double b = Double.parseDouble(JOptionPane.showInputDialog("b : "));
                double c = Double.parseDouble(JOptionPane.showInputDialog("c : "));
                double d = Double.parseDouble(JOptionPane.showInputDialog("d : "));
                double e = Double.parseDouble(JOptionPane.showInputDialog("e : "));
                double f = Double.parseDouble(JOptionPane.showInputDialog("f : "));
                double g = Double.parseDouble(JOptionPane.showInputDialog("g : "));
                double z = X * Y * a * b * c * d * e * f * g ;
                JOptionPane.showMessageDialog(null, z);
            }
        }
        else if (math.equals("4")) {
            String t = JOptionPane.showInputDialog("Enter the number of the variable :  (2-9)");

            if (t.equals("2")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double z = X / Y ;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("3")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double z = X / Y / a ;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("4")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double b = Double.parseDouble(JOptionPane.showInputDialog("b : "));
                double z = X / Y / a / b ;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("5")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double b = Double.parseDouble(JOptionPane.showInputDialog("b : "));
                double c = Double.parseDouble(JOptionPane.showInputDialog("c : "));
                double z = X / Y / a / b / c ;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("6")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double b = Double.parseDouble(JOptionPane.showInputDialog("b : "));
                double c = Double.parseDouble(JOptionPane.showInputDialog("c : "));
                double d = Double.parseDouble(JOptionPane.showInputDialog("d : "));
                double z = X / Y / a / b / c / d ;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("7")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double b = Double.parseDouble(JOptionPane.showInputDialog("b : "));
                double c = Double.parseDouble(JOptionPane.showInputDialog("c : "));
                double d = Double.parseDouble(JOptionPane.showInputDialog("d : "));
                double e = Double.parseDouble(JOptionPane.showInputDialog("e : "));
                double z = X / Y / a / b / c / d / e ;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("8")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double b = Double.parseDouble(JOptionPane.showInputDialog("b : "));
                double c = Double.parseDouble(JOptionPane.showInputDialog("c : "));
                double d = Double.parseDouble(JOptionPane.showInputDialog("d : "));
                double e = Double.parseDouble(JOptionPane.showInputDialog("e : "));
                double f = Double.parseDouble(JOptionPane.showInputDialog("f : "));
                double z = X / Y / a / b / c / d / e / f ;
                JOptionPane.showMessageDialog(null, z);
            }
            else if (t.equals("9")) {
                double X = Double.parseDouble(JOptionPane.showInputDialog("X : "));
                double Y = Double.parseDouble(JOptionPane.showInputDialog("Y : "));
                double a = Double.parseDouble(JOptionPane.showInputDialog("a : "));
                double b = Double.parseDouble(JOptionPane.showInputDialog("b : "));
                double c = Double.parseDouble(JOptionPane.showInputDialog("c : "));
                double d = Double.parseDouble(JOptionPane.showInputDialog("d : "));
                double e = Double.parseDouble(JOptionPane.showInputDialog("e : "));
                double f = Double.parseDouble(JOptionPane.showInputDialog("f : "));
                double g = Double.parseDouble(JOptionPane.showInputDialog("g : "));
                double z = X / Y / a / b / c / d / e / f / g ;
                JOptionPane.showMessageDialog(null, z);
            }
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
