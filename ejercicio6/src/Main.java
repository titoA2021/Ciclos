import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Pedir numeros hasta que se teclee un 0, mostrar la suma de todos los numeros introducidos
         */

        float num, sum=0;

        num = Float.parseFloat(JOptionPane.showInputDialog("Digite un numero: "));

        do {
            sum += num;
            JOptionPane.showMessageDialog(null, "La suma va en: " + sum);
            num = Float.parseFloat(JOptionPane.showInputDialog("Digite otro numero: "));
        } while (num != 0);
        JOptionPane.showMessageDialog(null, "No se puede introducir un 0, adios");
    }
}