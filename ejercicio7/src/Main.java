import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Pedir numeros hasta que se introduzca uno negativo y calcular la media (promedio)
         */

        float num, sum=0, prom;
        int cont=0;

        num = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero positivo: "));

        while (num >= 0){
            cont += 1;
            sum += num;
            num = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un numero positivo: "));
        }
        prom = sum/cont;
        JOptionPane.showMessageDialog(null, "EL promedio es: " + prom);

    }
}