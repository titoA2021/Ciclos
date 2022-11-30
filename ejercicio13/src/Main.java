import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Pedir 10 numeros. Mostrar la media de los numero positivos, la media de los numeros negativos y la cantidad de ceros
         */
        Scanner entrada = new Scanner(System.in);

        int sumPos=0,contPos=0, sumNeg=0, contNeg=0, cont0=0;

        for (int i = 1; i <= 10; i++){
            System.out.println("Digite el numero " + i + " : ");
            int num = entrada.nextInt();

            if (num > 0){
                sumPos += num;
                contPos ++;
            } else if (num < 0) {
                sumNeg += num;
                contNeg ++;
            } else if (num == 0) {
                cont0 ++;
            } else {
                System.out.println("Ingrese un numero valido");
            }

        }
        System.out.println("El promedio de #s positivos es: " + (sumPos/contPos));
        System.out.println("El promedio de #s negativos es: " + (sumNeg/contNeg));
        System.out.println("La cantidad de 0s es: " + cont0);
    }
}