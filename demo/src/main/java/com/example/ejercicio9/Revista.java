package com.example.ejercicio9;

public class Revista {
    private final String issn;
    private final String nombre;
    private final int numero;
    private int contadorNumero=1;
    
    public Revista(String issn, String nombre, int numero){
        // if(issn.matches("[0-9]{8}")) Publicacion Exception
        this.issn=issn;
        this.nombre=nombre;
        this.numero=contadorNumero++;
    }
}
