import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de $1000
         */

        Scanner entrada = new Scanner(System.in);
        int cont=0, total =0;

        for ( int i =1; i<=10; i++){
            System.out.println("ingrese el sueldo " + i + " : ");
            int sal = entrada.nextInt();
            total += sal;
            if (sal > 1000){
                cont ++;
            }
        }
        System.out.println("El total de los salarios es: " + total);
        System.out.println("La cantidad de salarios por encima de $1000 es: " + cont);
    }
}