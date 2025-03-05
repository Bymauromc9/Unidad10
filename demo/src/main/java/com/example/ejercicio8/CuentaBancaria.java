package com.example.ejercicio8;

import java.util.ArrayList;


public class CuentaBancaria {
    private final String iban;
    private final String titular;
    private double saldo;
    private ArrayList<String> movimientos;


    private static final double CANTIDAD_LIMITE=-50;
    private static final double LIMITE_HACIENDA=3000;

    public CuentaBancaria(String iban, String titular, double saldo) throws CuentaException, AvisarHaciendaException{
        if(!iban.matches("[A-Z]{2}\\d{22}"))
            throw new CuentaException("IBAN no valido");
        if(titular==null || titular.isEmpty())
            throw new CuentaException("Titular no valido");
        this.iban=iban;
        this.titular=titular;
        this.saldo=0;
        this.movimientos=new ArrayList<>();
    }

    public String getIban() {
        return iban;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public ArrayList<String> getMovimientos() {
        return movimientos;
    }

    public void ingresar(double dinero) throws CuentaException, AvisarHaciendaException{
        if(dinero<=0)
            throw new CuentaException("Ingreso debe ser mayor que 0");
        saldo+=dinero;
        movimientos.add("Ingreso: +"+dinero+"$");
        if(dinero>LIMITE_HACIENDA)
            throw new AvisarHaciendaException("AVISO: Avisar hacienda");
    }
    public void retirar(double dinero) throws CuentaException, AvisarHaciendaException{
        if(dinero<=0)
            throw new CuentaException("La retirada de dinero debe ser mayor que 0");
        
        double saldoNuevo=saldo-dinero;
        if(saldoNuevo<CANTIDAD_LIMITE)
            throw new CuentaException("Fondos insuficientes");
        saldo=saldoNuevo;

        if(saldo<0)
           throw new CuentaException("AVISO: Saldo negativo");
        if(dinero>LIMITE_HACIENDA)
            throw new AvisarHaciendaException("AVISO: Avisar hacienda");
    }
    public void mostrarMovimientos(){
        if(movimientos.size()<1){
            System.out.println("No hay movimientos todavia");
        }else{
        System.out.println("Movimientos");
        for (String movimiento : movimientos) {
            System.out.println(movimiento);
        }
    }
    }
    
}
