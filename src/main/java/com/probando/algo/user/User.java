package com.probando.algo.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by jmlopez on 18/05/17.
 */

@Entity
public class User {


    @Id
    @GeneratedValue
    //@Column(name="id", nullable=false)
    private Long id ;
    private String name ;
    private String lastname ;

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
}
