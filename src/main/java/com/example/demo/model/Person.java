package com.example.demo.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
    UUID id;
    String email;
    String password;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person(@JsonProperty("id") UUID id, @JsonProperty("email") String email ,@JsonProperty("password") String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    
}
