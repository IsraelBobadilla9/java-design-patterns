package com.bobadilla.design.pattern;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();
        UserDTO dto= directBuild(builder, user);
        System.out.println("start");
        System.out.println(dto.toString());
    }

    // director
    private static UserDTO directBuild(UserDTOBuilder builder, User user){
        UserDTO userDTO =  builder.withFirstName(user.getFirstName())
        .withLastName(user.getLastName())
        .withAddress(user.getAddress())
        .withBirthday(user.getBirthday())
        .build();
        return userDTO;
    }


    public static User createUser(){
        User user = new User();
        user.setBirthday(LocalDate.of(1960, 5, 6));
        user.setFirstName("Ron");
        user.setLastName("Swanson");
        Address address = new Address();
        address.setHouseNumber("100");
        address.setStree("State street");
        address.setCity("Pawnee");
        address.setState("Indiana");
        address.setZipcode("47998");
        user.setAddress(address);
        return user;
    }
}
