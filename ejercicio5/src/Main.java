import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Realizar un juego para adivinar un número. Para ellos generar un número aleatorio entre 0-100, y luego
        ir pidiendo numeros indicando "es mayor" o "es menor" segun sea respec to a N. El proceso termina cuando
        el usuario acierta y motrar el numero de intentos
         */

        int num, cont = 0, aleatorio = (int) (Math.random()*100);
        JOptionPane.showMessageDialog(null, aleatorio);

        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));
            if (num > aleatorio){
                JOptionPane.showMessageDialog(null, "El numero es menor");
                cont ++;
            } else if (num < aleatorio){
                JOptionPane.showMessageDialog(null, "El numero es mayor");
                cont ++;
            }
        } while(num != aleatorio);
        JOptionPane.showMessageDialog(null, "El numero es igual" + "\nse intentó " + cont + " veces");
    }
}