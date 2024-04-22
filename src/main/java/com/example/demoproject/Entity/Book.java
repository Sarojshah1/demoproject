package com.example.demoproject.Entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "books")
public class Book {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_seq_gen")
    @SequenceGenerator(name = "book_seq_gen", sequenceName = "book_setup_seq", allocationSize = 1)
    @Id
    private Long id;

    @Column(name = "booking_type")
    private String booking_type;

    @Column(name = "booking_time")
    private Date bookingtime;

    @Column(name = "time")
    private String time;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_user_user_id"))
    private users user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ground_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_books_ground_id"))
    private Ground ground;



}



