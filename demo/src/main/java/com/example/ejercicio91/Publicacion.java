package com.example.ejercicio91;

public abstract class Publicacion implements Comparable<Publicacion>{
    private static int contadorPublicaciones=1;

    final int identificador;

    public Publicacion(){
        identificador=contadorPublicaciones++;
    }

    public abstract void mostrarEnLinea();


    
}
