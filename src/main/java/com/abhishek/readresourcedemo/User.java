package com.abhishek.readresourcedemo;

import lombok.Data;

@Data
public class User {

    private Long id;
    private String name;
    private String dob;
    private Address address;
}
