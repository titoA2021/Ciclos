import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un numero negativo.
         */

        double num;
        boolean aux = false;

        while (aux == false){
            num = Double.parseDouble(JOptionPane.showInputDialog("Digite el numero para saber su cuadrado: "));
            if (num < 0){
                JOptionPane.showMessageDialog(null, "No puede ingresar numeros negativos");
                aux = true;
            } else {
                num = Math.pow(num, 2);
                JOptionPane.showMessageDialog(null, "El cuadrado es: " + num);
            }
        }
    }
}