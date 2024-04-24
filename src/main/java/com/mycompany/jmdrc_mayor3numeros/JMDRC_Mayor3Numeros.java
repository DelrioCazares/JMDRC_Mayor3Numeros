package com.mycompany.jmdrc_mayor3numeros;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class JMDRC_Mayor3Numeros {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int A, B, C;
        System.out.println("Ingresa el valor de A");
        A = teclado.nextInt();
        System.out.println("Ingresa el valor de B");
        B = teclado.nextInt();
        System.out.println("Ingresa el valor de C");
        C = teclado.nextInt();

        if (A > B) {
            System.out.println("El valor de A es mayor");
        } else {
            System.out.println("El valor de C es mayor");

        }
        if (B > C) {
            System.out.println("El valor de B es mayor");
        } else {
            System.out.println("El valor de C es mayor");
        }
    }
}
