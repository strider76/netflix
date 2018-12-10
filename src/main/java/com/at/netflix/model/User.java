package com.at.netflix.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_USER")
    private Long idUser;
    @Column(name = "USER_NAME",unique = true, nullable = false)
    private String userName;
    @Column(name = "USER_PASSWORD")
    private String password;

}
