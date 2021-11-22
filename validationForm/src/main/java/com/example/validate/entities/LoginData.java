package com.example.validate.entities;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LoginData {

    @NotBlank(message = "Username cannot be empty")
    @Size(min = 3, max = 18, message = "username must be between 3 to 18 characters")
    private String username;

    @NotBlank(message = "Email cannot be empty")
    private String email;

    @AssertTrue
    private boolean agreed;

    public boolean isAgreed() {
        return agreed;
    }

    public void setAgreed(boolean agreed) {
        this.agreed = agreed;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "LoginData [email=" + email + ", username=" + username + "]";
    }

    public LoginData() {
    }

    public LoginData(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
