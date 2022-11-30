import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Pedir 10 numeros y escribir la suma total
         */
        int num, sum=0;

        for(int i=1; i <= 10; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero " + i));
            sum += num;
        } JOptionPane.showMessageDialog(null, "la suma total es: " + sum);

    }
}