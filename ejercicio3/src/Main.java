import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Leer números hasta que se introduzca un 0
        Para cada numero indicar si es par o impar
         */

        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        while (num != 0){
            if (num%2 == 0){
                JOptionPane.showMessageDialog(null, "El numero " + num + " es par");
                num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro un numero"));
            } else if (num%2 != 0){
                JOptionPane.showMessageDialog(null, "El numero " + num + " es impar");
                num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro un numero"));
            }

        }
    }
}