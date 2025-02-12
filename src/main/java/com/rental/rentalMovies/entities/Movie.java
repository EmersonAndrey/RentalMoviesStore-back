package com.rental.rentalMovies.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Movie {

    @Id
    private Long id;

    @jakarta.validation.constraints.NotEmpty(message = "The poster_path must be provided")
    private String poster_path;

    @jakarta.validation.constraints.NotEmpty(message = "The backdrop_path must be provided")
    private String backdrop_path;

    @jakarta.validation.constraints.NotEmpty(message = "The title must be provided")
    private String title;

    @Lob
    @jakarta.validation.constraints.NotEmpty(message = "The image path must be provided")
    private String overview;

    @ManyToOne
    @JoinColumn(columnDefinition = "user_id")
    private User user;

}
