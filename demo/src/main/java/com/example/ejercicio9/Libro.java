package com.example.ejercicio9;

public class Libro extends Publicacion implements Comparable<Publicacion>{

    private final String isbn;
    private final String titulo;
    private final Autor autor;
    private int numeroEjemplares;

    public Libro(String isbn, String titulo, Autor autor){
        super();
        // if(!isbn.matches("[0-9]{13}"))
        this.isbn=isbn;
        this.titulo=titulo;
        this.autor=autor;
        this.numeroEjemplares=1;
    }
    public Libro(String isbn, String titulo, Autor autor, int numeroEjemplares){
        this(isbn, titulo, autor);
        // if(numeroEjemplares<0)
        this.numeroEjemplares=numeroEjemplares;
    }

    @Override
    void mostrarEnLinea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarEnLinea'");
    }
    @Override
    public int compareTo(Publicacion o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
    
}
