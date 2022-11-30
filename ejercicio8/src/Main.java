import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Main {
    public static void main(String[] args) {
        /*
        Pedir un numero N y mostrar todos los numeros hasta N
         */
        int num;
        num= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero: "));

        if (num >= 0){
            for (int i = 1; i <=num; i++){
                JOptionPane.showMessageDialog(null, i);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un numero entero posiitvo");
        }

    }
}