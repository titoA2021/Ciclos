import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        Diseñar un programa que muestre el producto de los 10 primeros numeros impares
         */
        int contIm = 0, prod = 1, num = 0;

        while (contIm <10){
            if (num%2 != 0){
                System.out.println("num "+ num + " , cont " + contIm);
                prod = prod * num;
                contIm ++;
                num ++;
            } else {
                System.out.println("num " + num);
                num ++;
            }
        }
        System.out.println("El producto de los primeros 10 numeros impares es: " + prod);
    }
}