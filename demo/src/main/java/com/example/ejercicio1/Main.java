package com.example.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un valor entero");

        try {

            int numero = entrada.nextInt();
            System.out.println("Numero introducido: " + numero);
        } catch (InputMismatchException e) {
            System.err.println("Valor introducido incorrecto");
            e.printStackTrace();
        }
        entrada.close();
    }
}
