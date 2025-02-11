package com.rental.rentalMovies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rental.rentalMovies.entities.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{
    
}
