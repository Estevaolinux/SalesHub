package com.saleshub.domain;
import jakarta.persistence.*;
@Entity @Table(name="customers") public class Customer { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @Column(nullable=false) private String name; @Column(nullable=false,unique=true) private String email; private boolean loyal; protected Customer(){} public Customer(String n,String e,boolean l){name=n;email=e;loyal=l;} public Long getId(){return id;} public boolean isLoyal(){return loyal;} }
