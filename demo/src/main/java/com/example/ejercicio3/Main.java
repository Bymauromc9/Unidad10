package com.example.ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] vector = new double[5];
        int contador = 0;

        while (contador < vector.length) {
            try {
                System.out.println("Introduce numero");
                vector[contador] = entrada.nextDouble();
                contador++;
            } catch (InputMismatchException e) {
                System.out.println("ERROR. Entrada no valida");
                break;
            }

        }

    }
}
