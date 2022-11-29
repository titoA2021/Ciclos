import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0.
         */

        int num;
        boolean aux = false;
        while (aux =false){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para saber si es positivo o negativo: "));
            if (num < 0){
                JOptionPane.showMessageDialog(null, "El numero es negativo");
            }else if (num > 0){
                JOptionPane.showMessageDialog(null, "El numero es positivo");
            }else if (num == 0){
                JOptionPane.showMessageDialog(null, "El numero es 0, adios");
                aux = true;
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
            }
        }
    }
}