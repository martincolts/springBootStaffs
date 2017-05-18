package com.probando.algo.user;


import javax.validation.constraints.NotNull;

/**
 * Created by jmlopez on 18/05/17.
 */
public class UserDTO {

    @NotNull
    private String name ;
    @NotNull
    private String lastname ;

    public UserDTO(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public User toUser (){
        User user = new User ();
        user.setLastname(this.lastname);
        user.setName(this.name);
        return user ;
    }
}
