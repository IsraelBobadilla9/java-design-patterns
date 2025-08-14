package com.bobadilla.estructural.decorator.Example2;

public abstract class CuentaDecorador implements CuentaBancariaI{

    protected CuentaBancariaI cuentaDecorada;

    public CuentaDecorador(CuentaBancariaI cuentaBancariaI){
        this.cuentaDecorada = cuentaBancariaI;
    }

    @Override
    public void abrirCuenta(Cuenta cuenta) {
        System.out.println("************Desde CuentaDecorada");
        this.cuentaDecorada.abrirCuenta(cuenta);

        
    }
    
}
