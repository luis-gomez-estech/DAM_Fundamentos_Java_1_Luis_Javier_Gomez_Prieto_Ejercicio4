package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner escaner = new Scanner (System.in);

        System.out.println("Introduce un número");
        int numero = escaner.nextInt();

        //Por tanto si el numero es positivo, imprimirá este mensaje en pantalla
        if (numero >0) {
            System.out.println("El número introducido es positivo");
        }

        //Si el numero es negativo, , imprimirá este mensaje en pantalla

        else if (numero <0) {
            System.out.println("El número introducido es negativo"); //
        }

        //Aqui he añadido el extra de que si el numero no es ni positivo ni negativo,
        // osea, es cero, que nos imprima la frase de que el numero introducido es cero

        else {
            System.out.println("El número introducido es cero");
        }


    }


}

