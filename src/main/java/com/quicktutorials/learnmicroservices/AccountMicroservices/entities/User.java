package com.quicktutorials.learnmicroservices.AccountMicroservices.entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;

@Entity
@Table(name="users")
public class User {
    @Id
    @Column(name="ID")
    private String id;
    @Column(name="USERNAME")
    private String username;
    @Column(name="PASSWORD")
    private String password;
    @Column(name="PERMISSION")
    private String permission;
    public User(){

    }
public User(String id, String username, String password, String permission) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.permission = permission;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
