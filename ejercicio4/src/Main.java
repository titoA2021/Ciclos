import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Pedir numeros hasta que se teclee uno negativo, y mostrar cuantos numeros se han introducido
         */
        int num,cont=0;

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            cont ++;
        } while (num >= 0);
        JOptionPane.showMessageDialog(null, "Se introdujeron " + cont + " numeros");
    }
}