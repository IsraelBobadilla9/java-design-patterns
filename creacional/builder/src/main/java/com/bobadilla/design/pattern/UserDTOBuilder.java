package com.bobadilla.design.pattern;

import java.time.LocalDate;

public interface UserDTOBuilder {

    // metodos para construir las partes del producto final 
    UserDTOBuilder withFirstName(String fname);
    UserDTOBuilder withLastName(String lname);
    UserDTOBuilder withBirthday(LocalDate date);
    UserDTOBuilder withAddress(Address address);

    // metodo para armar el objeto final 
    UserDTO build();
    UserDTO getUserDTO();
    

    
    
}
