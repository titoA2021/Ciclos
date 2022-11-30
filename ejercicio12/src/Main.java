import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Factorial de un número
         */
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite un número: ");
        int num = entrada.nextInt(), fact =1;

        if (num > 0){
            for (int i = 1; i <= num; i++){
                fact = fact*i;
            }
            System.out.println("el factorial del número " + num + " es: " + fact);
        } else if (num == 0){
            System.out.println("el factorial de 0 es 1");
        }else {
            System.out.println("Para poder calcular el factorial, el número debe ser positivo ");
        }

    }
}