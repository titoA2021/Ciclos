import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media,
        la cantidad de alumnos mayores de 18 años y la cantidad de alumnos que miden mas de 1.75
         */

        int edad, sumEdad=0,  contEdad=0, contAlt=0;
        float estatura, sumaEst=0.0f;

        for (int i = 1; i <= 3; i++){
            edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad " + i + " : "));
            estatura= Float.parseFloat(JOptionPane.showInputDialog("Digite la estatura " + i + " (con .): "));

            sumEdad += edad;
            sumaEst += estatura;

            if (edad >= 18){
                contEdad ++;
            }
            if (estatura >= 1.75f){
                contAlt ++;
            }
        }
        JOptionPane.showMessageDialog(null, "La edad promedio es: " + ((float)(sumEdad/3)) +
                "\nLa altura promedio es: " + ((float)(sumaEst/3)) + "\nLa cantidad de alumnos mayores de 18 años: " + contEdad +
                "\nLa cantidad de alumnos que miden mas de 1.75 es: " + contAlt);

    }
}