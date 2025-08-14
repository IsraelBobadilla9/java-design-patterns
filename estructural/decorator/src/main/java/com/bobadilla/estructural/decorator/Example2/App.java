package com.bobadilla.estructural.decorator.Example2;

public class App {
    public static void main(String[] args) {
        

        Cuenta cuenta = new Cuenta(2, "Israel");
        CuentaBancariaI cuentaAhorro = new CuentaAhorro();
        CuentaBancariaI cuentaBlindada = new BlindajeDecorador(cuentaAhorro);

        cuentaBlindada.abrirCuenta(cuenta);
        

    }
}
