package org.launchcode.spaday.models;

import javax.validation.constraints.*;

public class User {

    @NotEmpty(message="Username cannot be blank")
    @Size(min=5, max=15)
    private String username;

    @Email(message = "Please provide a valid email")
    private String email;

    @Size(min=6)
    @NotEmpty(message= "Password cannot be blank")
    private String password;

    @NotNull(message= "Passwords do not match")
    private String verifyPassword;

    public User() {

    }

    public User(String username, String email, String password, String verifyPassword) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verifyPassword = verifyPassword;
    }

    public String getUsername() {
        return username;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        checkPassword();
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
        checkPassword();

    }

    private void checkPassword(){
        if(!this.password.isEmpty() && (this.verifyPassword != null) && !this.password.equals(this.verifyPassword)){
                this.verifyPassword = null;
            }
        }
    }

