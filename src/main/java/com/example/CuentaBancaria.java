package com.example;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Error: La cantidad a depositar debe ser positiva.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            this.saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else if (cantidad > saldo) {
            System.out.println("Error: Fondos insuficientes.");
        } else {
            System.out.println("Error: La cantidad a retirar debe ser positiva.");
        }
    }
}