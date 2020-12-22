package com.one.digitalinnovation.beerstock.entity;

import com.one.digitalinnovation.beerstock.enums.BeerType;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Beer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private int max;

    @Column(nullable = false)
    private int quantity;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BeerType type;


    public Beer(Long id, String name, String brand, int max, int quantity, BeerType type) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.max = max;
        this.quantity = quantity;
        this.type = type;
    }

    public Beer() {
    }
}