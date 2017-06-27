package com.probando.algo.user;

import javax.persistence.*;

/**
 * Created by jmlopez on 18/05/17.
 */

@Entity
@Table(name="USERS")
public class User {

    @Id
    @GeneratedValue
    private Long id ;
    private String name ;
    private String lastname ;
    private String username ;
    private String password ;

    public User (){
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
