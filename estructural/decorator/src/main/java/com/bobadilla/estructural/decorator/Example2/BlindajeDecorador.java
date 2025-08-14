package com.bobadilla.estructural.decorator.Example2;

public class BlindajeDecorador extends CuentaDecorador{

    public BlindajeDecorador(CuentaBancariaI cuentaBancariaI) {
        super(cuentaBancariaI);
    }


    @Override
    public void abrirCuenta(Cuenta cuenta){
        cuentaDecorada.abrirCuenta(cuenta);
        // super.abrirCuenta(cuenta);
        agregarBlindaje(cuenta);
    }

    public void agregarBlindaje(Cuenta cuenta){
        System.out.println("Se agrego blindaje a la cuenta del cliente "+cuenta.getCliente());
    }
    
}
