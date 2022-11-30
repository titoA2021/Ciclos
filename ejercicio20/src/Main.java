import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Pedir un número N, introducir N sueldos y mostrar el maximo sueldo
         */
        int n;
        float sueldo, mayor = 0;

        n = Integer.parseInt(JOptionPane.showInputDialog("Cuantos sueldos desea agregar: "));

        for(int i=1; i<=n; i++){
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el sueldo de la persona " + i + " : "));
            if (mayor <= sueldo){
                mayor = sueldo;
            }
        }
        JOptionPane.showMessageDialog(null, "El mayor sueldo es: " + mayor);
    }
}