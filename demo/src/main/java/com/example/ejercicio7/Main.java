package com.example.ejercicio7;

import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Gato> listaGatos= new ArrayList<>();
        while (listaGatos.size()<5) {
            try{
                System.out.println("Nombre del gato");
                String nombre = entrada.nextLine();

                System.out.println("Edad del gato: ");
                int edad = entrada.nextInt();
                entrada.nextLine();

                Gato gato = new Gato(nombre,edad);
                System.out.println("Gato añadido a la lista");
            }catch(Exception e){
                System.err.println("ERROR. "+e.getMessage()+" Intentalo de nuevo.");
            }
        }
        System.out.println("Lista:");
        for (Gato gato : listaGatos) {
            gato.imprimir();
        }
        try{
            Gato gato1= new Gato("Min", 2);
            Gato gato2= new Gato("Minnie", 2);

            gato1.imprimir();

            try{
            Gato gato3= new Gato("La", 3);
            }catch (Exception e){
            System.out.println("Excepcion : "+e.getMessage());
            }
            try{
                gato2.setEdad(-3);
            }catch(Exception e){
                System.out.println("Excepcion: "+e.getMessage());
            }
        } catch(Exception e){
        System.err.println("ERROR al crear el objeto Gato "+e.getMessage());
        }
    }
}
