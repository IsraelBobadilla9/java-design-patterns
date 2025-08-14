package com.bobadilla.design.pattern;

import java.time.LocalDate;
import java.time.Period;

// esto sera un onbjeto inmutable
// esta es la manera mas comun en la vida real 
public class UserDTO {
// public interface UserDTO {

    

    private String name;
    private String address;
    private String age;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    private void setAge(String age) {
        this.age = age;
    }

    // creamos el builder dentro de nuestra clase

    public static UserDTOBuilder getBuilder(){
        return new UserDTOBuilder();
    }

    public static class UserDTOBuilder {
        private String firstName;
        private String lastName;
        private String age;
        private String address;
        private UserDTO userDTO;

        public UserDTOBuilder withFirstName(String fname) {
            this.firstName = fname;
            return this;

        }

        public UserDTOBuilder withLastName(String lname) {
            this.lastName = lname;
            return this;
        }

        public UserDTOBuilder withBirthday(LocalDate date) {
            Period ageInYears = Period.between(date, LocalDate.now());
            this.age = Integer.toString(ageInYears.getYears());
            return this;
        }

        public UserDTOBuilder withAddress(Address address) {
            this.address = address.getHouseNumber() + " , " + address.getStree()
                    + " , " + address.getCity() + " , " + address.getState() + " , " + address.getZipcode();
            return this;
        }

        public UserDTO build() {
            this.userDTO = new UserDTO();
            userDTO.setName(firstName+" "+lastName);
            userDTO.setAddress(address);
            userDTO.setAge(age);
            return userDTO;
        }

        public UserDTO getUserDTO() {
            return this.userDTO;
        }

    }

}
