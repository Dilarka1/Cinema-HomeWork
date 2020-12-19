package com.homework.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String user_id;

    private Long user_account_id;
    private String email;
    private String password;
    private String username;

    public User(String user_id, Long user_account_id, String email, String password, String username) {
        this.user_id = user_id;
        this.user_account_id = user_account_id;
        this.email = email;
        this.password = password;
        this.username = username;
    }
}
