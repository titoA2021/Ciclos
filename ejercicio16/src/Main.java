import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número
         */

        int num;
        boolean flag=false;
        while (flag==false){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entre 0 y 10: "));
            if (num >= 0 && num <= 10){
                for (int i=1; i <= 10; i++){
                    System.out.println(i + " * " + num + " = " + (i*num));
                }
                flag = true;
            }else {
                JOptionPane.showMessageDialog(null, "Ingresa un número entre 0 y 10");
            }
        }

    }
}