package com.example.demoproject.Entity;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "context")

public class content {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "parameter_setup_seq_gen")
    @SequenceGenerator(name = "parameter_setup_seq_gen", sequenceName = "parameters_setup_seq", allocationSize = 1)
    @Id
    private Integer id;
    @Column(name="content_name",nullable=false,length=255)
    private String contentname;



//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(name = "context_information",
//            foreignKey = @ForeignKey(name = "FK_users_informations_context_id"),
//            joinColumns = @JoinColumn(name = "context_id", referencedColumnName = "id"),
//            inverseForeignKey = @ForeignKey(name = "FK_context_informations_information_id"),
//            inverseJoinColumns = @JoinColumn(name = "information_id", referencedColumnName = "id"),
//            uniqueConstraints = @UniqueConstraint(name = "UNIQUE_context_information_informationid",
//                    columnNames = {"contextid", "information_id"})
//    )
//    private Collection<Information> information;

}
