package com.bobadilla.estructural.decorator.Example2;

public class CuentaCorriente implements CuentaBancariaI{

    @Override
    public void abrirCuenta(Cuenta cuenta) {
         System.out.println("--------");
        System.out.println("Se abrio una cuenta corriente");
        System.out.println("Cliente: "+cuenta.getCliente());
    }
    
}
