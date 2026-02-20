package com.example;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("PRUEBA EJERCICIO 1: LIBRO");
        Libro l1 = new Libro(); 
        l1.mostrarDetalles();

        Libro l2 = new Libro("Harry Potter", "J.K. Rowling");
        l2.mostrarDetalles();

        Libro l3 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200);
        l3.mostrarDetalles();

        System.out.println("\n--- PRUEBA EJERCICIO 2: CUENTA BANCARIA ---");
        CuentaBancaria cuenta = new CuentaBancaria("Luis", 500);
        cuenta.depositar(200);
        System.out.println("Saldo actual: " + cuenta.getSaldo());
        cuenta.retirar(1000); 

        System.out.println("\n--- PRUEBA EJERCICIO 3: ESTUDIANTE ---");
        Estudiante e = new Estudiante("Luis", 18, 2.5);
        e.mostrarInfo(); 
    }
}