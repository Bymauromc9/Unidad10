package com.example.ejercicio9;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Publicacion> lista= new ArrayList<>();

    public void anyadir(Publicacion p){
        lista.add(p);
    }
    public boolean anyadirLibro(String isbn, String titulo, Autor autor) throws PublicacionException{
        if(!isbn.matches("\\\\d{13}")||titulo==null||titulo.isEmpty()){

        }
            
        lista.add(new Libro(isbn, titulo, autor));
        return true;
    }
    }

