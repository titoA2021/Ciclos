import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionales (=4) y suspendidos
         */
        float nota;
        int contApro=0, contCond=0, contSusp = 0;
        for (int i=1; i <= 6; i++){
            nota = Float.parseFloat(JOptionPane.showInputDialog("Digite la nota " + i + " (de 0-10): "));
            if (nota > 4){
                contApro ++;
            } else if (nota == 4) {
                contCond ++;
            } else if (nota < 4) {
                contSusp ++;
            }
        }
        JOptionPane.showMessageDialog(null, "Alumnos aprobados: " + contApro
                                        + "\nAlumnos condicionales: " + contCond + "\nAlumnos suspendidos: " + contSusp);
    }
}