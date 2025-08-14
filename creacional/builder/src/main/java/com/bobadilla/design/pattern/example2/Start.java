package com.bobadilla.design.pattern.example2;

import java.time.LocalDate;

public class Start {
    public static void main(String[] args) {
        UsuarioDTO usuario1 = new UsuarioDTO.Builder()
        .setNombre("israel")
        .setEmail("buenas@hotmail.com")
        .setApellidos("Bobadilla")
        .setFechaDeNacimiento(LocalDate.now().minusYears(20))
        .setGenero("varon")
        .setEstadoCivil("soltero")
        .build();

        System.out.println(usuario1.toString());
    }
}
