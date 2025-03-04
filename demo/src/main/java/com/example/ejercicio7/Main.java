package com.example.ejercicio7;

public class Main {
    public static void main(String[] args) throws Exception {
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
