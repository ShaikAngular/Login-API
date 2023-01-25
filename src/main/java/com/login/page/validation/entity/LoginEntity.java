package com.login.page.validation.entity;

import jakarta.persistence.*;

@Entity
@Table(name="formvalidation")

public class LoginEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SNo")
    int id;

    @Column(name="username")
    String username;

    @Column(name="password")
    String password;

    @Override
    public String toString() {
        return "LoginEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    protected LoginEntity(int id, String username, String password) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
    }

    protected LoginEntity() {
        super();
    }
}
