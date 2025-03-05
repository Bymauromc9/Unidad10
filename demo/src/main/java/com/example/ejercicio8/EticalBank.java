package com.example.ejercicio8;

import java.net.Socket;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EticalBank {
    public static void main(String[] args) throws CuentaException, AvisarHaciendaException,InputMismatchException {
        Scanner entrada = new Scanner(System.in);
        int opcion=0;
        double cantidad=0;

        System.out.print("Introduce el IBAN: ");
        String iban = entrada.nextLine();
        System.out.print("Introduce el nombre del titular: ");
        String titular = entrada.nextLine();

        CuentaBancaria cuenta = new CuentaBancaria(iban, titular,0);
        do {
            System.out.println("1. Datos de la cuenta");
            System.out.println("2. IBAN");
            System.out.println("3. Titular");
            System.out.println("4. Saldo");
            System.out.println("5. Ingreso");
            System.out.println("6. Retirada");
            System.out.println("7. Mostrar movimientos");
            System.out.println("8. Salir");
            

            try{
                opcion=entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("IBAN: "+cuenta.getIban());
                    System.out.println("Titular: "+cuenta.getTitular());
                    System.out.println("Saldo: "+cuenta.getSaldo());
                    break;
                case 2:
                    System.out.println("IBAN: "+cuenta.getIban());
                    break;
                case 3:
                    System.out.println("Titular: "+cuenta.getTitular());
                    break;
                case 4:
                    System.out.println("Saldo: "+cuenta.getSaldo());
                    break;
                case 5:
                    System.out.println("Introduce la cantidad a ingresar: ");
                    cantidad = entrada.nextDouble();
                    cuenta.ingresar(cantidad);
                    break;
                case 6:
                    System.out.println("Introduce la cantidad a retirar: ");
                    cantidad = entrada.nextDouble();
                    cuenta.retirar(cantidad);
                    break;
                case 7: 
                    cuenta.mostrarMovimientos();
                    break;
                case 8:
                    System.out.println("Hasta pronto "+cuenta.getTitular());
                    break;
                default:
                System.err.println("ERROR. Opcion no valida. Intentalo de nuevo");
                    break;
            }
            }catch(CuentaException e){
                System.err.println("ERROR: "+e.getMessage());
            }catch(AvisarHaciendaException e){
                System.err.println(e.getMessage());
                System.err.println("Titular: "+cuenta.getTitular());
                System.err.println("IBAN: "+cuenta.getIban());
                System.err.println("Saldo: "+cuenta.getSaldo());
            
            }catch(InputMismatchException e){
                System.err.println("ERROR. Introduce un input correcto");
                entrada.next();

            }catch(Exception e){
                System.err.println("ERROR inesperado: "+e.getMessage());
                e.printStackTrace();
            }
        } while (opcion!=8);
        entrada.close();
    }
}

