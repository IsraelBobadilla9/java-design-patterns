package com.bobadilla.design.pattern.example2;

import java.time.LocalDate;
import java.util.Objects;

public class UsuarioDTO {

    private final String nombre;
    private final String apellidos;
    private final String email;
    private final String telefono;
    private final LocalDate fechaDeNacimiento;
    private final String genero;
    private final String estadoCivil;

    public UsuarioDTO(Builder builder){
        this.nombre = builder.nombre;
        this.apellidos = builder.apellidos;
        this.email = builder.email;
        this.telefono=builder.telefono;
        this.fechaDeNacimiento = builder.fechaDeNacimiento;
        this.genero = builder.genero;
        this.estadoCivil = builder.estadoCivil;

    }

    

    @Override
    public String toString() {
        return "UsuarioDTO [nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", telefono="
                + telefono + ", fechaDeNacimiento=" + fechaDeNacimiento + ", genero=" + genero + ", estadoCivil="
                + estadoCivil + "]";
    }



    public static class Builder {
        private String nombre;
        private String apellidos;
        private String email;
        private String telefono;
        private LocalDate fechaDeNacimiento;
        private String genero;
        private String estadoCivil;


        public Builder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }
        public Builder setApellidos(String apellidos) {
            this.apellidos = apellidos;
            return this;
        }
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Builder setTelefono(String telefono) {
            this.telefono = telefono;
            return this;
        }
        public Builder setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
            this.fechaDeNacimiento = fechaDeNacimiento;
            return this;
        }
        public Builder setGenero(String genero) {
            this.genero = genero;
            return this;
        }
        public Builder setEstadoCivil(String estadoCivil) {
            this.estadoCivil = estadoCivil;
            return this;
        }

        public UsuarioDTO build(){
            // aqui podemos meter ciertas validaciones 
            return new UsuarioDTO(this);
        }


    }

}
