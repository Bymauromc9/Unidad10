package com.example.ejercicio4;

import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int aleatorio=ThreadLocalRandom.current().nextInt(1,101);
        int[] vector= new int[aleatorio];
        int posicion=0;

        for (int i = 0; i < vector.length; i++) {
            vector[i]=ThreadLocalRandom.current().nextInt(1,11);
        }
        do {
            
      
        System.out.println("¿Que posicion quieres mostrar por pantalla?");
        try{
        posicion=entrada.nextInt();
        if(posicion<0){
            System.out.println("Fin del programa");
            break;
        }
        System.out.println(vector[posicion]);
        }catch(InputMismatchException e){
            System.out.println("Int irregular introducido");
            entrada.next();
        }catch(NoSuchElementException a){
            System.out.println("Input no encontrado");
        }catch(IllegalStateException i){
            System.out.println("Objeto scanner cerrado");
            break;
        }catch(ArrayIndexOutOfBoundsException o){
            System.out.println("ERROR. Posicin introducida fuera del rango valido (0- "+(vector.length-1)+")");
        }
        
        } while (true);
        entrada.close();
       
    }
}
