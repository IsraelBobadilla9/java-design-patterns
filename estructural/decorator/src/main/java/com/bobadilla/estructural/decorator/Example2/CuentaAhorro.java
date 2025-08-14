package com.bobadilla.estructural.decorator.Example2;

public class CuentaAhorro implements CuentaBancariaI{

    @Override
    public void abrirCuenta(Cuenta cuenta) {
        System.out.println("--------");
        System.out.println("Se abrio una cuenta de ahorros");
        System.out.println("Cliente: "+cuenta.getCliente());
    }
    
}
