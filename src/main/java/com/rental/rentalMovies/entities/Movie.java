package com.rental.rentalMovies.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @jakarta.validation.constraints.NotEmpty(message = "The title must be provided")
    private String title;

    @jakarta.validation.constraints.NotEmpty(message = "The director must be provided")
    private String director;

    @jakarta.validation.constraints.NotEmpty(message = "The duration must be provided")
    private String duration;

    @jakarta.validation.constraints.NotEmpty(message = "The image path must be provided")
    private String backdropPath;

    @ManyToOne
    @JoinColumn(columnDefinition = "user_id")
    private User user;

}
