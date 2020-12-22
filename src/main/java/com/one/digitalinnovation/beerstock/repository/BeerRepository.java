package com.one.digitalinnovation.beerstock.repository;

import com.one.digitalinnovation.beerstock.entity.Beer;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BeerRepository extends JpaRepository<Beer, Long> {
    Optional<Beer> findByName(String name);
}