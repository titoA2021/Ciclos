import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Pedir 10 numeros y mostrar al final si se ha introducido algun negativo
         */

        boolean flag = false;
        int num;
        for(int i=1; i<=10;i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero " + i + " : "));
            if (num < 0){
                flag = true;
            }
        }
        if (flag){
            JOptionPane.showMessageDialog(null, "Se introdujo un numero negativo");
        } else{
            JOptionPane.showMessageDialog(null, "No hay ningun numero negativo");
        }
    }
}