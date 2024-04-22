package com.example.demoproject.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Informations")

public class Information {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "information_seq_gen")
    @SequenceGenerator(name = "information_seq_gen", sequenceName = "information_setup_seq", allocationSize = 1)
    @Id
    private Integer id;
    @Column(name="name",nullable=false,length=255)
    private String name;
    @Column(name="age")
    private Integer age;

}
