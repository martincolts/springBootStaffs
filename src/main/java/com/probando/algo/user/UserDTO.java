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
    @NotNull
    private String password ;
    @NotNull
    private String username ;

    public UserDTO(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPassword (String password){
        this.password = password ;
    }

    public void setUsername (String username){
        this.username = username ;
    }

    public User toUser (){
        User user = new User ();
        user.setLastname(this.lastname);
        user.setName(this.name);
        user.setPassword(this.password);
        user.setUsername(this.username);
        return user ;
    }
}
