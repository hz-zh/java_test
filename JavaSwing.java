import javax.swing.*;

public class JavaSwing {
   public static void main (String[] args) {
      String inStr;     // instance of a String class (not a PDT)
      double base, exponent, answer;   // code for dialog box
      inStr = JOptionPane.showInputDialog(null, "Enter the base number:");
      base = Double.parseDouble(inStr);

      inStr = JOptionPane.showInputDialog(null, "Enter the exponent:");
      exponent = Double.parseDouble(inStr);

      answer = new Double(java.lang.Math.pow(base, exponent));
      JOptionPane.showMessageDialog(null, answer);
       

   } // end void main
} // end class JavaSwing
