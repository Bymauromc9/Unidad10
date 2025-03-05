package com.example.ejercicio9;


public class ValorIncorrecto extends Exception{
    private int valor;

    public ValorIncorrecto(int valor){
        super("Exepcion de valor incorrecto");
    }
    public ValorIncorrecto(int valor, String mensaje){
        super(mensaje);
        this.valor=valor;
    }
    @Override
    public String toString() {
        return "ValorIncorrecto [valor=" + valor + "]";
    }
    
}
