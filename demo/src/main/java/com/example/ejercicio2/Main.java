package com.example.ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try{
            System.out.println("Introduce 2 numero enteros");
            int numero = entrada.nextInt();
            int numero2=entrada.nextInt();

            int resultado= numero/numero2;
            System.out.println("[A/B="+resultado+"]");
        }catch (InputMismatchException e){
            System.out.println("ERROR: Valor introducido erroneo");
        }catch (ArithmeticException a){
            System.out.println("ERROR: No se puede dividir por cero");
        }finally{
            entrada.close();
        }
    }
}
