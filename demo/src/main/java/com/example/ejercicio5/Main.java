package com.example.ejercicio5;

public class Main {
    public static void main(String[] args) throws Exception {
        Main n = new Main();

        n.imprimeNegativo(3);
        n.imprimePositivo(-3);
    }
    void imprimePositivo(int p) throws Exception{
        if(p<=0)
            throw new Exception("ERROR. El numero "+p+" es negativo"); 
        System.out.println("Numero positivo: "+p);
    }
    void imprimeNegativo(int n) throws Exception{
        if(n>=0)
            throw new Exception("ERROR. El numero "+n+" es positivo");
        System.out.println("Numero negativo "+n);
    }
}
