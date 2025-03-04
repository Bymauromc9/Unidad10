package com.example.ejercicio6;

public class Gato {
    String nombre;
    int edad;
    public Gato(String nombre, int edad) throws Exception{
        setNombre(nombre);
        setEdad(edad);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre)throws Exception{
        if(nombre==null || nombre.length()<3)
            throw new Exception("ERROR. El nombre edebe tener al menos 3 caracteres");
        this.nombre=nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) throws Exception{
        if(edad<0)
            throw new Exception("ERROR. La edad no puede ser negativa");
        this.edad=edad;

    }

    public void imprimir(){
        System.out.println("GATO - Nombre: "+getNombre()+", Edad: "+getEdad()+" años");
    }
}
