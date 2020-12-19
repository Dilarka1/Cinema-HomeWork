package com.homework.entity;

import com.homework.enums.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String user_account_id;

    private String name;
    private String address;
    private String country;
    private String city;
    private Long postal_code;

    @Enumerated(EnumType.STRING)
    private Role role;

}
