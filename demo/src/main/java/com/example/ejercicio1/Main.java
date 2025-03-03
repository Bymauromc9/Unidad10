package com.example.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner entrada = new Scanner(System.in);

        try{
        System.out.println("Introduce un valor entero");
        int numero = entrada.nextInt();
        } catch(InputMismatchException e){
            System.out.println("Valor introducido incorrecto");
        } finally{
            entrada.close();
        }
    }
}
