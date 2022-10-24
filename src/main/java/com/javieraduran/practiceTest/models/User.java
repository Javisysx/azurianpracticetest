package com.javieraduran.practiceTest.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "users")
@ToString @EqualsAndHashCode
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    private int id;

    @Getter @Setter @Column(name = "first_name")
    private String first_name;

    @Getter @Setter @Column(name = "last_name")
    private String last_name;

    @Getter @Setter @Column(name = "nationality")
    private String nationality;

    @Getter @Setter @Column(name = "age")
    private int age;

    @Getter @Setter @Column(name = "email")
    private String email;
}
