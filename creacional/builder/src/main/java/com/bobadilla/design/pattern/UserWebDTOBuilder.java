package com.bobadilla.design.pattern;

import java.time.LocalDate;
import java.time.Period;

// implementacion concreta 
public class UserWebDTOBuilder implements UserDTOBuilder{

    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String fname) {
        this.firstName = fname;
        return this;

    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        this.lastName = lname;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        Period ageInYears = Period.between(date, LocalDate.now());
        this.age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address= address.getHouseNumber() + " , "+address.getStree()
        +" , "+address.getCity() +" , "+address.getState()+" , "+address.getZipcode();
        return this;
    }

    @Override
    public UserDTO build() {
        this.dto = new UserWebDTO(this.firstName+" "+this.lastName, address, age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return this.dto;
    }

    @Override
    public String toString() {
        return "UserWebDTOBuilder [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address="
                + address + ", dto=" + dto + "]";
    }

    
    
}
