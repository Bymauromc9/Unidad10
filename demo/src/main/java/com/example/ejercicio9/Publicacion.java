package com.example.ejercicio9;

public abstract class Publicacion {
    final int id;
    int contadorIds=1;
    public Publicacion(){
        this.id=contadorIds++;
    }
    /**
     * Imprimira por pantalla la info de la publicacion. 
     * Se mostrara de forma tabular, es decir con el espacio establecido
     * para cada campo, como en una tabla
     */
    abstract void mostrarEnLinea();
}
