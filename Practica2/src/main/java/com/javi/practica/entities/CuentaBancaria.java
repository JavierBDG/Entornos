package com.javi.practica.entities;

public class CuentaBancaria {


    private String iban;
    private String titular;
    private double saldo;
    private String banco;
    private String moneda;
    private boolean activa;
    private String fechaApertura;
    private String tipoCuenta;


    public CuentaBancaria() {
    }


    public CuentaBancaria(String iban, String titular, double saldo, String banco,
                          String moneda, boolean activa, String fechaApertura, String tipoCuenta) {
        this.iban = iban;
        this.titular = titular;
        this.saldo = saldo;
        this.banco = banco;
        this.moneda = moneda;
        this.activa = activa;
        this.fechaApertura = fechaApertura;
        this.tipoCuenta = tipoCuenta;
    }


    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }


    public static boolean validarIban(String iban) {
        return iban != null && iban.length() >= 15;
    }

    public static double calcularInteres(double saldo, double porcentaje) {
        return saldo * porcentaje / 100;
    }
}
