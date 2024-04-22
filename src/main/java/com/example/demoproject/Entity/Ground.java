package com.example.demoproject.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "ground")
@Setter
@Getter
public class Ground {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ground_seq_gen")
    @SequenceGenerator(name = "ground_seq_gen", sequenceName = "ground_setup_seq", allocationSize = 1)
    @Id
    private Integer id;

    @Column(name = "ground_name")
    private String ground_name;

}
